import java.util.Scanner;

class PrintOdd{
    public static void main(String args[]){
	int range,x;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your range: ");
	range = sc.nextInt();
	
	for(int i = 0; i<range; i++){
	x = 2*i + 1;
	System.out.println(x);
	}
	}
}