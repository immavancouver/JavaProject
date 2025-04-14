package Lesson_13;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class WordCounter {

	private final String[] words;

	public WordCounter(String... words) {
		this.words = words;
	}

	public Set<String> getUnique() {
		if (words == null) {
			return Collections.emptySet();
		}

		return new LinkedHashSet<>(Arrays.asList(words));

	}

	public Map<String, Long> getFrequency() {
		if (words == null) {
			return Collections.emptyMap();
		}

		var frequencyMap = new LinkedHashMap<String, Long>();
		for (var word : words) {
			frequencyMap.compute(word, (key, oldValue) -> Objects.requireNonNullElse(oldValue, 0L) + 1L);
		}

		return frequencyMap;
	}
}
