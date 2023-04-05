class Que_16{
    public static void main(String args[]){
        int i = 1000;

        //Q1.
        String str = Integer.toString(i);
        System.out.println(str);

        //Q2.
        Integer i1 = new Integer(i);
        System.out.println(i1);

        //Q3.
        Integer i2 = new Integer(str);
        System.out.println(i2);

        //Q4.
        String str1 = Integer.toBinaryString(i);
        System.out.println(str1);

        String str2 = Integer.toHexString(i);
        System.out.println(str2);

        String str3 = Integer.toOctalString(i);
        System.out.println(str3);
    }
}