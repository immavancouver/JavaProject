package Lesson_9;

public class Main {
	public static void main(String[] args) {
		System.out.println("=== Testing Animal Classes ===");

		Dog dog = new Dog("Rex");
		Cat cat = new Cat("Salem");

		System.out.println("--- Testing Run Method ---");
		dog.run(400);
		cat.run(250);

		System.out.println("--- Testing Swim Method ---");
		dog.swim(8);
		dog.swim(15);
		cat.swim(5);

		System.out.println("=== Testing FoodBowl Class ===");
		FoodBowl bowl = new FoodBowl(10);

		Cat[] cats = {
				new Cat("Punsh"),
				new Cat("Matroskin"),
				new Cat("Tom")
		};

		System.out.println("--- Testing Eat Method ---");
		for (Cat c : cats) {
			System.out.println(c.name + " is trying to eat...");
			c.eat(bowl, 4); // Попробуем покормить каждую кошку 4 единицами еды
		}


		System.out.println("\nAdding more food to the bowl...");
		bowl.addFood(5);


		System.out.println("\nTrying to feed the cats again...");
		for (Cat c : cats) {
			if (!c.isFull()) { // Если кошка еще голодна
				System.out.println(c.name + " is trying to eat...");
				c.eat(bowl, 4);
			} else {
				System.out.println(c.name + " is already full.");
			}
		}

		System.out.println("=== Testing Payment Class ===");
		Payment payment = new Payment("Robert");

		Payment.Purchase purchase1 = payment.new Purchase("Apples", 5, 1.2);
		Payment.Purchase purchase2 = payment.new Purchase("Milk", 2, 3.5);

		purchase1.printDetails();
		purchase2.printDetails();

		System.out.println("=== Testing Park Class ===");
		Park park = new Park("CrazyClownLand");

		Park.Attraction attraction1 = park.new Attraction("Roller Coaster", "10:00 - 18:00", 15.0);
		Park.Attraction attraction2 = park.new Attraction("Ferris Wheel", "11:00 - 20:00", 10.0);

		attraction1.printDetails();
		attraction2.printDetails();
	}
}
