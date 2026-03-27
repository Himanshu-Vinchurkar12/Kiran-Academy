package polymorphisms_task_1;

public class Product {
	String name;
	String description;
	double price;
	double discountPercent;

	public Product(String name, String description, double price, double discountPercent) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.discountPercent = discountPercent;
	}

	public double calculateDiscount() {
		return price * discountPercent / 100;
	}

	public double calculateDiscount(double extraPercent) {
		return price * (discountPercent + extraPercent) / 100;
	}

	public void displayInfo() {
		double discount = calculateDiscount();
		double finalPrice = price - discount;

		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Original Price: ₹" + price);
		System.out.println("Discount: " + discountPercent + "%");
		System.out.println("Final Price: ₹" + finalPrice);
		System.out.println("----------------------------------");
	}
}
