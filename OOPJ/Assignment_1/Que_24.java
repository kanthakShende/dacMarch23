class Que_24{
    public static void main(String args[]){
     float f1 = 100.1F;

     //Q1.
     String str = Float.toString(f1);
     System.out.println(str);

     //Q2.
     Float fl = new Float(f1);
     System.out.println(fl);

     //Q3.
     Float fl2 = new Float(str);
     System.out.println(fl2);

     //Q4.
     String str1 = Float.toHexString(f1);
     System.out.println(str1);
    }
}