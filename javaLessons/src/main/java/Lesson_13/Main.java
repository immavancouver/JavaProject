package Lesson_13;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		var words = new WordCounter("apple", "banana", "apple", "orange", "banana", "grape", "apple", "kiwi", "orange", "kiwi");

		System.out.println("Unique words:");
		words.getUnique().forEach(System.out::println);

		System.out.println("\nWords frequency:");
		words.getFrequency().forEach((key, value) -> System.out.println(key + ": " + value));

		var phoneDirectory = new PhoneDirectory();
		phoneDirectory.add("Smith", "123-456-7890");
		phoneDirectory.add("Johnson", "987-654-3210");
		phoneDirectory.add("Smith", "555-555-5555");
		phoneDirectory.add("Brown", "111-222-3333");
		phoneDirectory.add("Johnson", "444-444-4444");

		printNumbersByLastName(phoneDirectory, "Smith");
		printNumbersByLastName(phoneDirectory, "Johnson");
		printNumbersByLastName(phoneDirectory, "Brown");
		printNumbersByLastName(phoneDirectory, "Davis");
	}

	private static void printNumbersByLastName(PhoneDirectory phoneDirectory, String lastName) {
		System.out.printf("%nPhone numbers for %s:%n", lastName);

		phoneDirectory.get(lastName).forEach(System.out::println);
	}
}
