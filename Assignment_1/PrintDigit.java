import java.util.Scanner;

class PrintDigit{
     public static void main(String args[]){
	 int num,digit;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your number: ");
	 num = sc.nextInt();
	 
	 while(num>0){
	 digit = num%10;
	 System.out.println(digit);
	 num = num/10;
	 }
	 
	 }
}