import java.util.Scanner;

class Swap{
       public static void main(String args[]){
	     int num1,num2;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your two numbers :");
		 num1 = sc.nextInt();
		 num2 = sc.nextInt();
		 System.out.println("Before Swapping the numbers are: num1 = "+ num1+" and num2 = "+ num2);
		 num1 = num1*num2;
		 num2 = num1/num2;
		 num1 = num1/num2;
		 System.out.println("Afer Swapping the numbers are: num1 = "+ num1+" and num2 = "+ num2);
		 
		 
	   }
}