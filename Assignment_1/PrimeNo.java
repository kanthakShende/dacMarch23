import java.util.Scanner;

class PrimeNo{
   public static void main(String args[]){
       int num,x;
	   int count = 0;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter your number: ");
	   num = sc.nextInt();
	   
	   for(int i = 1; i<=num; i++){
		   x = num%i;
	       if(x==0)
	       count++;
	   }
	   if(count==2)
	   System.out.println("The number "+num+" is a prime no.");
	   else
	   System.out.println("The number "+num+" is not a prime no.");
	   
   }
}