package all_inheritance;

public class TestLaptops {

	public static void main(String[] args) {
		Asus asus = new Asus();
		asus.companyName();
		System.out.println(asus.year);
		asus.Screen();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		Lenovo ln = new Lenovo();
		ln.companyName();
		System.out.println(ln.year);
		ln.Screen();
		ln.OperatingSystem();
	
	}

}
