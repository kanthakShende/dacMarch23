import java.util.Scanner;

class LcmOfNum{
    public static void main(String args[]){
	int num1,num2,lcm;
	int gcd = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values of num1 and num2: ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	for(int i = 1; i<=num1&&i<=num2; i++){
	   if(num1%i==0&&num2%i==0){
	   gcd = i;
	   }
	}
	lcm = (num1*num2)/gcd;
	System.out.println("LCM of "+num1+" and "+num2+" is:"+lcm);
	
	
	
	}
}