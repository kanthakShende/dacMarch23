import java.util.Scanner;

class Palindrome{
   public static void main(String args[]){
      int num,digit;
	  int rev = 0;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your number: ");
	  num = sc.nextInt();
	  int temp = num;
	  
	  while(num>0){
	  digit = num%10;
	  rev = rev*10 + digit;
	  num = num/10;
	  }
	  if(rev==temp){
	  System.out.println("the no. "+temp+" is palindrome");
	  }
	  else
	  System.out.println("the no. "+temp+" is not palindrome");
   }
}