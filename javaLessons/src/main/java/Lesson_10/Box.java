package Lesson_10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
	private ArrayList<T> fruits;

	public Box() {
		this.fruits = new ArrayList<>();
	}

	public void addFruit(T fruit) {
		fruits.add(fruit);
	}

	public float getWeight() {
		if (fruits.isEmpty()) {
			return 0.0f;
		}
		float totalWeight = 0.0f;
		for (T fruit : fruits) {
			totalWeight += fruit.getWeight();
		}
		return totalWeight;
	}

	public boolean compare(Box<?> anotherBox) {
		return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
	}

	public void transferFruit(Box<T> anotherBox) {
		if (anotherBox == null || anotherBox == this) {
			throw new IllegalArgumentException("Invalid transfer operation.");
		}

		anotherBox.fruits.addAll(this.fruits);
		this.fruits.clear();
	}

	public void printContents() {
		System.out.println("Box contains " + fruits.size() + " fruits with total weight: " + getWeight());
	}
}
