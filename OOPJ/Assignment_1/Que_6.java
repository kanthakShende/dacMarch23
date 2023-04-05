class Que_6{

public static void main(String args[]){
  boolean b = false;

  //Q1.
  String str = Boolean.toString(b);
  System.out.println(str);

  //Q2.
  Boolean b1 = new Boolean(b);
  System.out.println("Value of the instance is :"+b1 );

  //Q3.
  boolean b2 = Boolean.parseBoolean(str);
  System.out.println(b);

  //Q4.
  Boolean b3 = new Boolean(str);
  System.out.println(b2);
}
}