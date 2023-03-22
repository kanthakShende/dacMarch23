class Pattern9{
   public static void main(String args[]){
     for(char i = 'A'; i<='E'; i++){
	    for(int j = (int)'E'-(int)i; j>=1; j--){
		System.out.print(" ");
		}
		for(char k = 'A'; k<=i; k++){
		System.out.print(k+" ");
		}
		System.out.println();
	 }
   
   }

}