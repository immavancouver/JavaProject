package Lesson_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {

	private final Map<String, List<String>> lastNamesToPhoneNumbers;

	public PhoneDirectory() {
		lastNamesToPhoneNumbers = new HashMap<>();
	}

	public void add(String lastName, String phoneNumber) {
		lastNamesToPhoneNumbers.computeIfAbsent(lastName, key -> new ArrayList<>())
				.add(phoneNumber);
	}

	public List<String> get(String lastName) {
		return Collections.unmodifiableList(
				lastNamesToPhoneNumbers.getOrDefault(lastName, Collections.emptyList()));
	}

}
