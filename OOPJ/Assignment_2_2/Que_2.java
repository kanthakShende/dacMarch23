import java.util.Scanner;

class BMI{
private double height;
private double weight;

public BMI(double height, double weight){
   this.height = height;
   this.weight = weight;
}

double calculateBMI(){
    double bmi = this.weight/(this.height*this.height);
    return bmi;
}
}

class Que_2{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your height & weight");
    double height = sc.nextDouble();
    double weight = sc.nextDouble();

    BMI b1 = new BMI(height,weight);
    double bmi = b1.calculateBMI();
    System.out.println("BMI: "+bmi);
}

}
