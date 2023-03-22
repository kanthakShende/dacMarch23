import java.util.Scanner;

class GcdOfNum{
   public static void main(String args[]){
   int num1,num2;
   int gcd = 0;
  
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your two numbers: ");
   num1 = sc.nextInt();
   num2 = sc.nextInt();
   
   for(int i = 1; i<=num1&&i<=num2; i++){
         if(num1%i==0&&num2%i==0){
		   gcd = i;
		 }
   }
   System.out.println("The GCD of "+num1+" and "+num2+" is: "+gcd);
   
   }

}