package Lesson_9;

public class FoodBowl {
	private int foodAmount;

	public FoodBowl(int initialFood) {
		this.foodAmount = initialFood;
	}

	public void addFood(int amount) {
		if (amount > 0) {
			foodAmount += amount;
			System.out.println("Added " + amount + " units of food to the bowl.");
		} else {
			System.out.println("Cannot add negative amount of food.");
		}
	}

	public boolean eatFood(int amount) {
		if (foodAmount >= amount) {
			foodAmount -= amount;
			System.out.println("Ate " + amount + " units of food.");
			return true;
		} else {
			System.out.println("Not enough food in the bowl.");
			return false;
		}
	}

	public int getFoodAmount() {
		return foodAmount;
	}
}
