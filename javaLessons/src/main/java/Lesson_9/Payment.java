package Lesson_9;

public class Payment {
	private String customerName;

	public Payment(String customerName) {
		this.customerName = customerName;
	}

	public class Purchase {
		private String itemName;
		private int quantity;
		private double price;

		public Purchase(String itemName, int quantity, double price) {
			this.itemName = itemName;
			this.quantity = quantity;
			this.price = price;
		}

		public double getTotalCost() {
			return quantity * price;
		}

		public void printDetails() {
			System.out.println(customerName + " bought " + quantity + " " + itemName + " for $" + getTotalCost());
		}
	}
}
