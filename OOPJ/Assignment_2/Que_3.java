import java.time.*;
class Que_3{
    public static void main(String args[]){
        int date = 30;
        int month = 07;
        int year = 2000;

        LocalDateTime ldt = LocalDateTime.now();
        int date1 = ldt.getDayOfMonth();
        int month1 = ldt.getMonthValue();
        int year1 = ldt.getYear();

        int date2 = date1-date;
        int month2 = month1-month;
        int year2 = year1-year;

        System.out.println("Age: "+year2+"yrs "+month2+"mt"+date2+"days");

    }
}