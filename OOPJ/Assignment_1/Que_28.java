class Que_28{
   public static void main(String args[]){
    double db = 1555.2;

    //Q1.
    String str = Double.toString(db);
    System.out.println(str);

    //Q2.
    Double dbl = new Double(db);
    System.out.println(dbl);

    //Q3.
    Double dbl1 = new Double(str);
    System.out.println(dbl1);

    //Q4.
    String str1 = Double.toHexString(db);
    System.out.println(str1);

    long l1 = Double.doubleToLongBits(db); 
    System.out.println(l1);


   }
}