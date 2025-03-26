package Lesson_8;

public class Main {
	public static void main(String[] args) {

		Employee[] employees = new Employee[5];


		employees[0] = new Employee("Lashkin Dmitriy", "HR Specialist", "lashKin@mailbox.com", "8044123122", 30000, 30);
		employees[1] = new Employee("Petrov Vasylii", "Manager", "petrov.v@mailbox.com", "80293456781", 50000, 45);
		employees[2] = new Employee("Dovydenko Maria", "Engineer", "dovydenko.m@mailbox.com", "80292398765", 40000, 50);
		employees[3] = new Employee("Polyakov Alexander", "Developer", "polyakov.alex@mailbox.com", "80332311223", 60000, 35);
		employees[4] = new Employee("Yarkova Elena", "Accountant", "yarkova.e@mailbox.com", "80332333445", 45000, 55);

		System.out.println("Employees older than 40:");
		for (Employee employee : employees) {
			if (employee.getAge() > 40) {
				employee.displayInfo();
			}
		}
	}
}
