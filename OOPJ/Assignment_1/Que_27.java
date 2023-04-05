class Que_27{
    public static void main(String args[]){
        double d1 = 100.5;
        double d2 = 150.2;
        
        //Q1
        System.out.println("The number of bits used to represent a double value is: "+Double.BYTES*8);
        
        //Q2
        System.out.println("The number of bytes used to represent a double value is: "+Double.BYTES);
        
        //Q3
        System.out.println("The maximum of two numbers is: "+Double.max(d1,d2));

        //Q4
        System.out.println("The minimum of two numbers is: "+Double.min(d1,d2));
    }
}