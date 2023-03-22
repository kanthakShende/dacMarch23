import java.util.Scanner;

class SumOfDigit{
    public static void main(String args[]){
	int num,digit,temp;
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number: ");
	num = sc.nextInt();
	temp = num;
	
	while(num>0){
	digit = num%10;
	sum = digit + sum;
	num = num/10;
	}
	System.out.println("The sum of the digits of "+temp+" is:"+sum);
	}
}