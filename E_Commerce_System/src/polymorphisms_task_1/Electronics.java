package polymorphisms_task_1;

public class Electronics extends Product {
	private int warrantyPeriod;
	private String brand;

	public Electronics(String name, String description, double price, int warrantyPeriod, String brand,double discountPercent) {
		super(name, description, price, discountPercent);
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
	}

    @Override
	public double calculateDiscount() {
		return price * discountPercent / 100;
	}

	@Override
	public void displayInfo() {
		double discount = calculateDiscount();
		double finalPrice = price - discount;

		System.out.println("Category: Electronics");
		System.out.println("Brand: " + brand);
		System.out.println("Warranty: " + warrantyPeriod + " years");
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Original Price: ₹" + price);
		System.out.println("Discount: " + discountPercent + "%");
		System.out.println("Final Price: ₹" + finalPrice);
		System.out.println("----------------------------------");
	}
}
