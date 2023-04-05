class Que_14{

 public static void main(String args[]){
    short s = 100;
    Short s1 = new Short(s);

    byte b = s1.byteValue();
    System.out.println(b);

    short s2 = s1.shortValue();
    System.out.println(s2);

    int i = s1.intValue();
    System.out.println(i);

    long l = s1.longValue();
    System.out.println(l);

    float f = s1.floatValue();
    System.out.println(f);

    double d = s1.doubleValue();
    System.out.println(d);
 }
}