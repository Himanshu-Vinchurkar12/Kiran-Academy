package HomeWorks;
class LibraryManagement{

    String title;
    String author;
    String isbn;
    boolean isAvailable;

    LibraryManagement(String title, String author, String isbn, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public void BorrowBook(){
        isAvailable = false;
        System.out.println("You have borrowed: " + title);
    }

    public void ReturnBook(){
        isAvailable = true;
        System.out.println("You have returned: " + title);
    }

    public void bookAvailability(){
        if(isAvailable){
            System.out.println(title + " is available for borrowing.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    public static void main(String[] args){
        LibraryManagement book1 = new LibraryManagement("Mrutyunjay", "Shivaji Sawant", "978-0-7432-7356-5", true);
        book1.BorrowBook();
        book1.ReturnBook();   

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");

        LibraryManagement book2 = new LibraryManagement("PaniPath", "Viswas Patil", "978-0-7432-7356-6", true);
        book2.BorrowBook();

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        book1.bookAvailability();
        book2.bookAvailability();


    }
}