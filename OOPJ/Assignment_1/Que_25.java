class Que_25{
    public static void main(String args[]){
        float f1 = 25.5F;
        Float fl = new Float(f1);

        byte b = fl.byteValue();
        System.out.println(b);

        short s = fl.shortValue();
        System.out.println(s);

        int i = fl.intValue();
        System.out.println(i);

        long l = fl.longValue();
        System.out.println(l);

        float f2 = fl.floatValue();
        System.out.println(f2);

        double d = fl.doubleValue();
        System.out.println(d);


    }
}