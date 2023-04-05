class Que_13{
    public static void main(String args[]){
        
        short s = 100;
        //Q1.
        String str = Short.toString(s);
        System.out.println(str); 

        //Q2.
        Short s1 = new Short(s);
        System.out.println(s1);

        //Q3.
        Short s2 = new Short(str);
        System.out.println(s2);

    }
}