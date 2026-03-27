package HomeWorks;

class Persion{
    String name;
    int age;

    Persion(String n, int a){
        name = n;
        age = a;
    }

    Persion(){
        System.out.println("This is default constructor");
    }

    public void displayPersion(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Persion p = new Persion("Himanshu", 22);
        p.displayPersion();

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        Persion p1 = new Persion("Rohit", 25);
        p1.displayPersion();

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        Persion p2 = new Persion("Pranay", 21);
        p2.displayPersion();

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        Persion p3 = new Persion();
        p3.name = "Ankit";
        p3.age = 24;
        p3.displayPersion();


    }
}