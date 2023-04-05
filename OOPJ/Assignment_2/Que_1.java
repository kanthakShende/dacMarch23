import java.util.Calendar;
class Que_1{
    public static void main(String args[]){
        Calendar cl = Calendar.getInstance();

        int hr = cl.get(Calendar.HOUR);
        int min = cl.get(Calendar.MINUTE);
        int sec = cl.get(Calendar.SECOND);
        int mil = cl.get(Calendar.MILLISECOND);

        System.out.println("Time: "+hr+":"+min+":"+sec+":"+mil);
}
}