import java.util.Scanner;

class PrimeFactors{
      	public static boolean isPrime(int x){
			int count = 0, num = x;
		    for(int j = 1; j<=num; j++){
		    int y = num%j;
	          if(y==0)
	          count++;
	        } 
	         if(count==2){
			 return true;
			 }
			 else
			 return false;
		 }
	  public static void main(String args[]){
	     int num=0;		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your number: ");
		 num = sc.nextInt();
		 int temp = num;
		 
		 System.out.println("Prime factors are ");
	    
		for(int i = 2; i<=temp; i++){
			if(isPrime(i)){
				if(temp%i==0){
					System.out.println(i);
				    temp = temp/i;
				    i--;
				}
			}
		}
		 
	  }

}