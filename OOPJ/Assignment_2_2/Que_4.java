import java.util.Scanner;

class ElectricBill{

private String customerName;
private double unitsConsumed;
private double billAmount;

public ElectricBill(String customerName,double unitsConsumed){
    this.customerName = customerName;
    this.unitsConsumed = unitsConsumed;
}

public void getDetails(){
    System.out.println("############################");
    System.out.println("Name: "+this.customerName);
    System.out.println("Units consumed "+this.unitsConsumed);
}

public void calculateBillAmount(){
    if(this.unitsConsumed<100){
        double billAmount = unitsConsumed*5;
        System.out.println("Bill: "+billAmount);
        System.out.println("############################");
    }
    else if(this.unitsConsumed>100 && this.unitsConsumed<200){
        double billAmount = unitsConsumed*7;
        System.out.println("Bill: "+billAmount);
        System.out.println("############################");
    }
    else{
        double billAmount = unitsConsumed*10;
        System.out.println("Bill: "+billAmount);
        System.out.println("############################");
    }
}

}

class Que_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name:");
        String customerName = sc.nextLine();
        System.out.println("Enter units consumed:");
        double unitsConsumed = sc.nextDouble();
        ElectricBill eb = new ElectricBill(customerName,unitsConsumed);
        eb.getDetails();
        eb.calculateBillAmount();
    }
}