import java.util.Scanner;

class CreditScore{
 private int creditHistory;
 private double creditUtilization;
 private boolean paymentHistory;

 public CreditScore(int creditHistory, double creditUtilization){
    this.creditHistory = creditHistory;
    this.creditUtilization = creditUtilization;
 }

 void setPaymentHistory(){
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter your payment history as 'if good' press 'true' else 'false'");
    this.paymentHistory = sc1.nextBoolean();
 }

 void getPaymentHistory(){
    System.out.println("##################################");
    System.out.println("Your Credit History: "+this.creditHistory);
    System.out.println("Your Credit Credit utilization: "+this.creditUtilization);
    System.out.println("Is your payment history good: "+this.paymentHistory);
 }

 int calculateCreditScore(){
    if(this.paymentHistory == true){
    int creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        return creditScore;
    }
    else{
    int creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
         return creditScore;
    }
 }

}

class Que_10{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Credit history:");
        int creditHistory = sc.nextInt();
        System.out.println("Enter your Credit utilization: ");
        double creditUtilization = sc.nextDouble();
        CreditScore cs = new CreditScore(creditHistory, creditUtilization);
        cs.setPaymentHistory();
        int creditScore = cs.calculateCreditScore();
        cs.getPaymentHistory();
        System.out.println("Your credit score is: "+creditScore);
        System.out.println("##################################");

    }
}