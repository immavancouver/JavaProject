package Lesson_13;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	public static void main(String[] args) {
		String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "kiwi", "orange", "kiwi"};

		Map<String, Integer> wordCountMap = new HashMap<>();
		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		System.out.println("Unique words:");
		for (String word : wordCountMap.keySet()) {
			System.out.println(word);
		}

		System.out.println("\nWord counts:");
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
