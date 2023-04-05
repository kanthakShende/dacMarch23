class Que_29{
    public static void main(String args[]){
        double dl = 25550.5;
        Double db = new Double(dl);

        byte b = db.byteValue();
        System.out.println(b);

        short s = db.shortValue();
        System.out.println(s);

        int i = db.intValue();
        System.out.println(i);

        long l = db.longValue();
        System.out.println(l);

        float fl = db.floatValue();
        System.out.println(fl);

        double dl1 = db.doubleValue();
        System.out.println(dl1);
    }
}