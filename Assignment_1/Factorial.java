import java.util.Scanner;

class Factorial{
      public static void main(String args[]){
	  
	  int fact = 1;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your number: ");
	  int num = sc.nextInt();
	  
	  for(int i = 1;i<=num;i++){
	  fact = fact*i;
	  }
	  System.out.println("The factorial of the given number is : "+ fact);
	  }
}