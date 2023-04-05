class Que_21{

    public static void main(String args[]){
        long l = 100000;

        Long l1 = new Long(l);

        byte b = l1.byteValue();
        System.out.println(b);

        short s = l1.shortValue();
        System.out.println(s);

        int i = l1.intValue();
        System.out.println(i);

        long l2 = l1.longValue();
        System.out.println(l);

        float f = l1.floatValue();
        System.out.println(f);

        double d = l1.doubleValue();
        System.out.println(d);
    }
}