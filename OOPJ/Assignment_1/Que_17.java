class Que_17{

    public static void main(String args[]){
        int i = 1000;
        Integer i1 = new Integer(i);

        byte b = i1.byteValue();
        System.out.println(b);

        short s = i1.shortValue();
        System.out.println(s);

        int i2 = i1.intValue();
        System.out.println(i2);

        long l = i1.longValue();
        System.out.println(l);

        float f = i1.floatValue();
        System.out.println(f);

        double d = i1.doubleValue();
        System.out.println(d);
    }
}