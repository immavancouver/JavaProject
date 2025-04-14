package Lesson_13;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	private String[] words;

	public WordCounter(String[] words) {
		this.words = words;
	}

	public Map<String, Integer> countWords() {
		Map<String, Integer> wordCountMap = new HashMap<>();
		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}
		return wordCountMap;
	}

	public void printUniqueWords(Map<String, Integer> wordCountMap) {
		System.out.println("Unique words:");
		for (String word : wordCountMap.keySet()) {
			System.out.println(word);
		}
	}

	public void printWordCounts(Map<String, Integer> wordCountMap) {
		System.out.println("\nWord counts:");
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
