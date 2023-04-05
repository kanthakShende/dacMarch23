class Que_20{
    public static void main(String args[]){
     long l = 100000;

     //Q1.
     String str = Long.toString(l);
     System.out.println(str);

     //Q2.
     Long l1 = new Long(l);
     System.out.println(l1);

     //Q3.
     Long l2 = new Long(str);
     System.out.println(l2);

     //Q4.
     String str1 = Long.toBinaryString(l);
     System.out.println(str1);

     String str2 = Long.toHexString(l);
     System.out.println(str2);

     String str3 = Long.toOctalString(l);
     System.out.println(str3);
    }
}