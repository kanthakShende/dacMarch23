import java.util.Scanner;

class SmallestNo{
   public static void main(String args[]){
     int n1,n2,n3;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the values of n1, n2 and n3");
	 n1 = sc.nextInt();
	 n2 = sc.nextInt();
	 n3 = sc.nextInt();
	 
	 int sml = (n1<n2&&n1<n3)?n1:((n2<n1&&n2<n3)?n2:n3);
	 System.out.println("The Smallest number is: "+sml);
     
        
   
   }
}