package Lesson_9;

public class Animal {
	protected String name;
	protected int runLimit;
	protected int swimLimit;
	private static int animalCount = 0;

	public Animal(String name, int runLimit, int swimLimit) {
		this.name = name;
		this.runLimit = runLimit;
		this.swimLimit = swimLimit;
		animalCount++;
	}

	public static int getAnimalCount() {
		return animalCount;
	}

	public void run(int distance) {
		if (distance <= runLimit) {
			System.out.println(name + " ran " + distance + " meters.");
		} else {
			System.out.println(name + " couldn't run " + distance + " meters. Run limit: " + runLimit + " meters.");
		}
	}

	public void swim(int distance) {
		if (distance <= swimLimit) {
			System.out.println(name + " swam " + distance + " meters.");
		} else {
			System.out.println(name + " couldn't swim " + distance + " meters. Swim limit: " + swimLimit + " meters.");
		}
	}
}
