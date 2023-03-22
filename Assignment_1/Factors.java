import java.util.Scanner;

class Factors{
    public static void main(String args[]){
	    int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number :");
		num = sc.nextInt();
		
		System.out.println("The factors of "+num+" is:");
		for(int i = 1; i <= num; i++){
		   if(num%i==0){
		   System.out.println(i);
		   }
		
		}
	}
            
}