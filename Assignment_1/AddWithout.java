import java.util.Scanner;

class AddWithout{
   public static void main(String args[]){
   
   int num1,num2;
   
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values of num1 and num2: ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	int x = num1;
	for(int i = 1; i<=num2; i++){
	x++;
	}
	System.out.println("The sum of two numbers is: "+x);
	
	
   }
}