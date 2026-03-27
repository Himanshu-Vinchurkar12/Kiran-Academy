package polymorphisms_task_1;
import java.util.*;

public class Test_Ecommerce {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        ArrayList<Product> products = new ArrayList<>();

	        while (true) {
	            System.out.println("\n===== E-Commerce System =====");
	            System.out.println("1. Add Electronics");
	            System.out.println("2. Add Clothing");
	            System.out.println("3. Display All Products");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter name: ");
	                    String ename = sc.nextLine();

	                    System.out.print("Enter description: ");
	                    String edesc = sc.nextLine();

	                    System.out.print("Enter price: ");
	                    double eprice = sc.nextDouble();

	                    System.out.print("Enter warranty (years): ");
	                    int warranty = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter brand: ");
	                    String brand = sc.nextLine();

	                    System.out.print("Enter discount percentage: ");
	                    double ediscount = sc.nextDouble();

	                    products.add(new Electronics(ename, edesc, eprice, warranty, brand, ediscount));
	                    System.out.println("Electronics added successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter name: ");
	                    String cname = sc.nextLine();

	                    System.out.print("Enter description: ");
	                    String cdesc = sc.nextLine();

	                    System.out.print("Enter price: ");
	                    double cprice = sc.nextDouble();
	                    sc.nextLine();

	                    System.out.print("Enter size: ");
	                    String size = sc.nextLine();

	                    System.out.print("Enter color: ");
	                    String color = sc.nextLine();

	                    System.out.print("Enter material: ");
	                    String material = sc.nextLine();

	                    System.out.print("Enter discount percentage: ");
	                    double cdiscount = sc.nextDouble();

	                    products.add(new Clothing(cname, cdesc, cprice, size, color, material, cdiscount));
	                    System.out.println("Clothing added successfully!");
	                    break;

	                case 3:
	                    if (products.isEmpty()) {
	                        System.out.println("No products available.");
	                    } else {
	                        for (Product p : products) {
	                        	System.out.println();
	                            p.displayInfo();  
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting... Thank you!");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }

	}

}
