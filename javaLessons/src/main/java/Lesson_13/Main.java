package Lesson_13;

import java.util.Map;

public class Main {
	public static void main(String[] args) {

		String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "kiwi", "orange", "kiwi"};
		WordCounter wordCounter = new WordCounter(words);

		Map<String, Integer> wordCountMap = wordCounter.countWords();
		wordCounter.printUniqueWords(wordCountMap);
		wordCounter.printWordCounts(wordCountMap);

		PhoneDirectory phoneDirectory = new PhoneDirectory();

		phoneDirectory.add("Smith", "123-456-7890");
		phoneDirectory.add("Johnson", "987-654-3210");
		phoneDirectory.add("Smith", "555-555-5555");
		phoneDirectory.add("Brown", "111-222-3333");
		phoneDirectory.add("Johnson", "444-444-4444");

		System.out.println("\nPhone numbers for Smith:");
		for (String number : phoneDirectory.get("Smith")) {
			System.out.println(number);
		}

		System.out.println("\nPhone numbers for Johnson:");
		for (String number : phoneDirectory.get("Johnson")) {
			System.out.println(number);
		}

		System.out.println("\nPhone numbers for Brown:");
		for (String number : phoneDirectory.get("Brown")) {
			System.out.println(number);
		}

		System.out.println("\nPhone numbers for Davis:");
		for (String number : phoneDirectory.get("Davis")) {
			System.out.println(number);
		}
	}
}
