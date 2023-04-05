class Que_9{
    public static void main(String args[]){
        byte b1 = 100;

        Byte b2 = new Byte(b1);

        byte b = b2.byteValue();
        System.out.println(b);

        short s = b2.shortValue();
        System.out.println(s);

        int i  = b2.intValue();
        System.out.println(i);

        long l = b2.longValue();
        System.out.println(l);

        float f = b2.floatValue();
        System.out.println(f);

        double d = b2.doubleValue();
        System.out.println(d);

        
    }
}