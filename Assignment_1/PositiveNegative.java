import java.util.Scanner;

class PositiveNegative{
         public static void main(String args[]){
		 int num;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your number : ");
		 num = sc.nextInt();
		 
		 if(num>0)
		 System.out.println("Entered number is positive");
		 else
		 System.out.println("Entered number is negative");
		 }
}