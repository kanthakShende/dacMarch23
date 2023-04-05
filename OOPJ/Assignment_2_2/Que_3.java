import java.util.Scanner;
class Books{
  private String title;
  private String author;
  private String publisher;
  private String isbn;
  private int year;
  private double price;
  private int quantity;
  Scanner sc = new Scanner(System.in);
  
  public void setBook(){
    System.out.println("Title: ");
    String title = sc.nextLine();
    this.title = title;

    System.out.println("Author: ");
    String author = sc.nextLine();
    this.author = author;

    System.out.println("Publisher: ");
    String publisher = sc.nextLine();
    this.publisher = publisher;

    System.out.println("ISBN: ");
    String isbn = sc.nextLine();
    this.isbn = isbn;

    System.out.println("Year: ");
    int year = sc.nextInt();
    this.year = year;

    System.out.println("Price: ");
    double price = sc.nextDouble();
    this.price = price;

    System.out.println("Quantity: ");
    int quantity = sc.nextInt();
    this.quantity = quantity;
 }

 public void incresaseQuantity(int quantity){
    this.quantity = this.quantity + quantity;
 }

 public void decresaseQuantity(int quantity){
    this.quantity = this.quantity - quantity;
 }


 public void getBooks(){
     System.out.println("Title: "+this.title);
    
     System.out.println("Author: "+this.author);
    
     System.out.println("Publisher: "+publisher);
    
     System.out.println("ISBN: "+isbn);
    
     System.out.println("Year: "+year);
    
     System.out.println("Price: "+price);
    
     System.out.println("Quantity: "+quantity);
       
  }

  public double getInventoryValue(){
    return this.price * this.quantity;
  }

}

class Que_3{
 public static void main(String args[]){
   Scanner sc1 = new Scanner(System.in);
   Books b1 = new Books();
  
   b1.setBook();

   System.out.println("Enter the quantity to be increased: ");
   int iq = sc1.nextInt();
   b1.incresaseQuantity(iq);

   System.out.println("Enter the quantity to be decreased: ");
   int dq = sc1.nextInt();
   b1.decresaseQuantity(dq);

   b1.getBooks();

   double iv = b1.getInventoryValue();
   System.out.println("Inventory Value: "+iv);

 }
}