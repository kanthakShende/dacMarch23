import java.util.Scanner;

class PrintEven{
   public static void main(String args[]){
   int range,x;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your range");
   range = sc.nextInt();
   
   for(int i = 1; i<=range; i++){
    x = 2*i;
	System.out.println(x);
   }
   }
}