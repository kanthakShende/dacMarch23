import java.util.Scanner;

class Transpose{
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows: ");
	int rows = sc.nextInt();
	System.out.println("Enter the number of coloumn: ");
	int coloumn = sc.nextInt();
	
	int temp1 = rows;
	int temp2 = coloumn;
	
	int arr1[][] = new int[rows][coloumn];
	int arr2[][] = new int[temp2][temp1];
	
	
	System.out.println("Enter the elements of Array: ");
	for(int i = 0; i<rows; i++){
	 for(int j = 0; j<coloumn; j++){
	  arr1[i][j] = sc.nextInt();
	  }
	}
	
	for(int i = 0; i<temp2; i++ ){
	  for(int j = 0; j<temp1; j++){
	  arr2[i][j] = arr1[j][i];
	  }
	}
	
	for(int i = 0; i<temp2; i++){
	  for(int j = 0; j<temp1; j++){
	  System.out.print(arr2[i][j]+" ");
	  }
	  System.out.println();
	}
	
	
   }
}