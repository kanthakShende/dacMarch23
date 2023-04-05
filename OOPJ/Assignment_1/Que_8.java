class Que_8{
    public static void main(String args[]){
        byte b = 100;
        //Q1.
        String str = Byte.toString(b);
        System.out.println(str);

        //Q2.
        Byte b1 = new Byte(b);
        System.out.println(b1);

        //Q3.
        Byte b2 = new Byte(str);
        System.out.println(b2);

    }
}