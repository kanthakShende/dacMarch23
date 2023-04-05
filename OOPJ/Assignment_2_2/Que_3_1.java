import java.util.Scanner;

class BookManagement{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private int price;
    private int quantity;

    void setTitle(String title){
       this.title = title;
    }
    String getTitle(){
        return this.title;
    }

    void setAuthor(String author){
       this.author = author;
    }
    String getAuthor(){
        return this.author;
    }

    void setPublisher(String publisher){
       this.publisher = publisher;
    }
    String getPublisher(){
        return this.publisher;
    }

    void setISBN(String isbn){
       this.isbn = isbn;
    }
    String getISBN(){
        return this.isbn;
    }

    void setYear(int year){
       this.year = year;
    }
    int getYear(){
        return this.year;
    }

    void setPrice(int price){
       this.price = price;
    }
    int getPrice(){
        return this.price;
    }

    void setQuantity(int quantity){
       this.quantity = quantity;
    }

    void increaseQuantity(int quantity){
        this.quantity = this.quantity + quantity;
        System.out.println("New Quantity: "+this.quantity);
    }
    void decreaseQuantity(int quantity){
        this.quantity = this.quantity - quantity;
        System.out.println("New Quantity: "+this.quantity);
    }

    int getQuantity(){
        return this.quantity;
    }

    void getInventoryValue(){
        int inventoryValue = this.quantity*this.price;
        System.out.println("Quantity: "+this.quantity);
        System.out.println("Inventory Value = "+inventoryValue);
    }
}


class BookManagementTest{
    Scanner sc = new Scanner(System.in);
    private BookManagement bm = new BookManagement();

    void acceptRecord(){
        System.out.println("Title: ");
        bm.setTitle(sc.nextLine());

        System.out.println("Author Name: ");
        bm.setAuthor(sc.nextLine());

        System.out.println("Publisher Name: ");
        bm.setPublisher(sc.nextLine());

        System.out.println("ISBN: ");
        bm.setISBN(sc.nextLine());

        System.out.println("Year: ");
        bm.setYear(sc.nextInt());

        System.out.println("Price: ");
        bm.setPrice(sc.nextInt());

        System.out.println("Quantity: ");
        bm.setQuantity(sc.nextInt());       
    }

    void printRecord(){
        System.out.println("##############################");
        System.out.println("Title: "+bm.getTitle());
        System.out.println("Author: "+bm.getAuthor());
        System.out.println("Publisher: "+bm.getPublisher());
        System.out.println("ISBN: "+bm.getISBN());
        System.out.println("Year: "+bm.getYear());
        System.out.println("Price: "+bm.getPrice());
        System.out.println("Quantity: "+bm.getQuantity());
        System.out.println("##############################");

    }

    public int menuList( ){
    System.out.println("##############################");
    System.out.println("0.Exit");
    System.out.println("1.Increase book Quantiy:");
    System.out.println("2.Decrease book Quantiy:");
    System.out.println("3.Get Book Inventory");
    System.out.println("Enter choice  : ");
    System.out.println("##############################");
    int choice = sc.nextInt();
        return choice;
  }

  void increaseQuantity(){
        System.out.println("Enter quantity to be increased: ");
        int quantity = sc.nextInt();
        bm.increaseQuantity(quantity);
    }
    void decreaseQuantity(){
        System.out.println("Enter quantity to be decreased: ");
        int quantity = sc.nextInt();
        bm.decreaseQuantity(quantity);
    }
    void getInventory(){
        bm.getInventoryValue();
    }
}

class Que_3_1{
    public static void main(String args[]){
       BookManagementTest bmt = new BookManagementTest();
       bmt.acceptRecord();
       bmt.printRecord();
       int choice;

       while((choice = bmt.menuList()) != 0){
        switch(choice){
            case 1:
            bmt.increaseQuantity();
            break;

            case 2:
            bmt.decreaseQuantity();
            break;

            case 3:
            bmt.getInventory();
            break;

            default:
            System.out.println("Enter valid input!!!!");
        }
       }


    }
}