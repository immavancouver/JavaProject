package Lesson_10;

public class Main {
	public static void main(String[] args) {
		Box<Apple> appleBox1 = new Box<>();
		Box<Apple> appleBox2 = new Box<>();
		Box<Orange> orangeBox = new Box<>();

		appleBox1.addFruit(new Apple());
		appleBox1.addFruit(new Apple());
		appleBox1.addFruit(new Apple());

		orangeBox.addFruit(new Orange());
		orangeBox.addFruit(new Orange());

		System.out.println("Apple Box 1:");
		appleBox1.printContents();

		System.out.println("Orange Box:");
		orangeBox.printContents();

		System.out.println("\nComparing weights of appleBox1 and orangeBox...");
		System.out.println("Are appleBox1 and orangeBox equal in weight? " + appleBox1.compare(orangeBox));

		System.out.println("\nTransferring apples from appleBox1 to appleBox2...");
		appleBox1.transferFruit(appleBox2);

		System.out.println("Apple Box 1 after transfer:");
		appleBox1.printContents();

		System.out.println("Apple Box 2 after transfer:");
		appleBox2.printContents();

		System.out.println("\nAdding one more orange to orangeBox...");
		orangeBox.addFruit(new Orange());
		orangeBox.printContents();

		System.out.println("\nComparing weights of appleBox2 and orangeBox...");
		System.out.println("Are appleBox2 and orangeBox equal in weight? " + appleBox2.compare(orangeBox));
	}
}
