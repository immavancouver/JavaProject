package Lesson_9;

public class Cat extends Animal {
	private static int catCount = 0;
	private boolean fullness;

	public Cat(String name) {
		super(name, 200, 0);
		this.fullness = false;
		catCount++;
	}

	public static int getCatCount() {
		return catCount;
	}

	public void eat(FoodBowl bowl, int amount) {
		if (bowl.eatFood(amount)) {
			fullness = true;
			System.out.println(name + " is now full.");
		} else {
			System.out.println(name + " couldn't eat.");
		}
	}

	public boolean isFull() {
		return fullness;
	}
}
