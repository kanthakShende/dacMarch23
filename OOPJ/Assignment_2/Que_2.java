import java.time.*;
class Que_2{
    public static void main(String args[]){
        LocalDateTime ldt = LocalDateTime.now();
        int date = ldt.getDayOfMonth();
        int month = ldt.getMonthValue();
        int year = ldt.getYear();

        int hr = ldt.getHour();
        int min = ldt.getMinute();
        int sec = ldt.getSecond();
        int mili = ldt.getNano();

        System.out.println("Date: "+date+"/"+month+"/"+year);
        System.out.println("Time: "+hr+":"+min+":"+sec+":"+mili);
    }
}