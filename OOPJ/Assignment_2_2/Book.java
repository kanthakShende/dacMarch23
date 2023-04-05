import java.util.Scanner;
class Book1
{
  private  String title;
  private  String author;
  private  String publisher;
  private  String isbn;
  private  int year;
  private  double price;
  private  int quantity;

 Book1()
 {
    this.title=title;
    this.Author=author;
    this.publisher=publisher;
    this.isbn=isbn;
    this.year=year;
    this.price=price;
    this.quantity=quantity;
 }
 
 
 Book1( String title, String Author, String publisher, String isbn, int year, double price, int quantity)
 {
	 this.title=title;
    this.author=Author;
    this.publisher=publisher;
    this.isbn=isbn;
    this.year=year;
    this.price=price;
    this.quantity=quantity;
 }	
 
 public void settitle(String title)
 {
    this.title=title;
	
	
 }

 public void setAuthor(String Author)
 {
    this.author=author;
 }

 public void setpublisher(String publisher)
 {
    this.publisher=publisher;
 }

 public void setisbn(String isbn)
 {
    this.isbn=isbn;
 }

 public void setyear(int year)
 {
    this.year=year;
 }

 public void setprice(double price)
 {
    this.price=price;
 }
 public void setquantity(int quantity)
 {
    this.quantity=quantity;
 }
 

 public String gettitle()
 {
   return this.title;
  
  
 }
 public String getAuthor()
  {
     return this.Author;
	  
	 
  }

public String getpublisher()
  {
   return this.publisher;
  
  }

public String getisbn()
{
   return this.isbn;
  
}

public int getyear()
{
   return this.year;
 
}

public double getprice()
{
   return this.price;
   
}

public int getquantity()
{
   return this.quantity;
   
}


   public void increaseQuantity(int quantity)
    {
        this.quantity= quantity+200;
    }


      public void decreaseQuantity(int quantity)
    {
        this.quantity= quantity-100;
    }


    public double getInventoryValue(double price, int quantity)
    {
        double inventory;
        return inventory= (this.price * this.quantity);
    }
}
class Book 
{
   public static void main(String [] args)
   {
	   Book1 b = new Book1();
      Scanner sc= new Scanner(System.in);

      System.out.println("enter title");
      String title = sc.nextLine();
      

      System.out.println("enter author");
      String author = sc.nextLine();
      

      System.out.println("enter publisher");
      String publisher = sc.nextLine();
      

      System.out.println("isbn number");
      String isbn = sc.nextLine();
      

      System.out.println("Year");
      int year= sc.nextInt();
	  
	  System.out.println("price");
      double price= sc.nextDouble();
	  
	  
	  System.out.println("quantity");
      int quantity= sc.nextInt();
	  
	  
	  System.out.println("Author: " + b.getAuthor());

   }
}