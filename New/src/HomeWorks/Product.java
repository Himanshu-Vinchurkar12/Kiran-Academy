package HomeWorks;

class Product{

    int productId ;
    String productName;
    double price;
    int quantity;

    // Default Constructor
    Product(){
        productId = 0;
        productName = "";
        price = 0.00;
        quantity = 0;

    }

    // Parametrized Constructor
    Product(int id, String name , double pr, int qty){
        productId = id;
        productName = name;
        price = pr;
        quantity = qty;
    }

    public int updateQuantity(int qty){
        quantity = quantity+qty;
        return quantity;
    }

    public void displayProduct(){
        System.out.println("Product Id is:  "+productId);
        System.out.println("Product Name is:  "+productName);
        System.out.println("Product Price is:  "+price);
        System.out.println("Product Quantity is:  "+quantity);
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.displayProduct();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        Product p2 = new Product(101, "Laptop", 55000.50, 10);
        System.out.println("Initial Product Details for Laptop:");
        p2.displayProduct();
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        Product p3 = new Product(102, "Samsung M35 Mobile", 15000.60, 100);
        System.out.println("Initial Product Details for Mobile:");
        p3.displayProduct();

        // Updating quantity for laptop
        p2.updateQuantity(5);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("After Updating Quantity of Laptop:");
        p2.displayProduct();
                
        p3.updateQuantity(150);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("After Updating Quantity of Mobile:");
        p3.displayProduct();

    }
}