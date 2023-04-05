import java.util.Scanner;

class TelephoneBillCalculation{

private String customerName;
private String phoneNumber;
private int noOfCallmade;
private int durationOfCall;

public void setDetails(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Name: ");
    this.customerName = sc.nextLine();
    System.out.println("Phone number: ");
    this.phoneNumber = sc.nextLine();
    System.out.println("No. of calls made: ");
    this.noOfCallmade = sc.nextInt();
    System.out.println("Duration of calls: ");
    this.durationOfCall = sc.nextInt();
}

public void getDetails(){
    System.out.println("############################");
    System.out.println("Name: "+this.customerName);
    System.out.println("Phone number: "+this.phoneNumber);
    System.out.println("No. of calls made: "+this.noOfCallmade);
    System.out.println("Duration of calls: "+this.durationOfCall);
}

public void billAmount(){
    if(this.noOfCallmade <= 100){
        double amount = this.noOfCallmade*50 + 100;
        System.out.println("Amount: "+amount);
        System.out.println("############################");
    }
    else{
        double amount = this.noOfCallmade*25 + 100;
        System.out.println("Amount: "+amount);
        System.out.println("############################");
    }
}
}

class Que_5{
    public static void main(String args[]){
    TelephoneBillCalculation tbc = new TelephoneBillCalculation();
    tbc.setDetails();
    tbc.getDetails();
    tbc.billAmount();
}
}