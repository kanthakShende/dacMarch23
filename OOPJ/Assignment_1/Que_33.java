class Que_33{
    public static void main(String args[]){
        String str = args[0];
        String str1 = args[1];

        int num = Integer.parseInt(str);
        int num1 = Integer.parseInt(str1);

        double d1 = Double.parseDouble(str);
        double d2 = Double.parseDouble(str1);




        int sum = num + num1;
        System.out.println(sum);

        double sum1 = d1 + d2;
        System.out.println(sum1); 

        int diff = num - num1;
        System.out.println(diff);

        double diff1 = d1 - d2;
        System.out.println(diff1);

        int mul = num * num1;
        System.out.println(mul);

        double mul1 = d1 * d2;
        System.out.println(mul1);

        double div = num / num1;
        System.out.println(div);

        double div1 = d1 / d2;
        System.out.println(div1);
    }
}