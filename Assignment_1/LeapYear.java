import java.util.Scanner;

class LeapYear{
     public static void main(String args[]){
	 int yr;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your year: ");
	 yr = sc.nextInt();
	 if(yr%4==0){
	     if(yr%100==0){
		      if(yr%400==0){
			   System.out.println(yr+" is leap year");
			  }
			  else
			   System.out.println(yr+" is not a leap year");	  
		      }
	     else
		       System.out.println(yr+" is leap year");
	 }
	     else
	     System.out.println(yr+" is not a leap year");
	 
	 }
}