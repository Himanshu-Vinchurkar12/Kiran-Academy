package polymorphisms_task_1;

public class Clothing extends Product {
	private String size;
	private String color;
	private String material;

	public Clothing(String name, String description, double price, String size, String color, String material,double discountPercent) {
		super(name, description, price, discountPercent);
		this.size = size;
		this.color = color;
		this.material = material;
	}

	@Override
	public double calculateDiscount() {
		return price * discountPercent / 100;
	}

	@Override
	public void displayInfo() {
		double discount = calculateDiscount();
		double finalPrice = price - discount;

		System.out.println("Category: Clothing");
		System.out.println("Size: " + size);
		System.out.println("Color: " + color);
		System.out.println("Material: " + material);
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Original Price: ₹" + price);
		System.out.println("Discount: " + discountPercent + "%");
		System.out.println("Final Price: ₹" + finalPrice);
		System.out.println("----------------------------------");
	}

}
