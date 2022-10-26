import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class dates2 {

  public static void main (String [] args){
    int daysOne = daysBetween();
    if(daysOne>0){
      System.out.println("It has been " + daysOne + " since days given.");
    } else {
      System.out.println("It has been " + daysOne*-1 + " since days given.");
    }
  }

  public static int daysBetween () {
    //write a function that takes two dates and returns an integer that represents the number 
    //of days between dates, so that the program outputs the number of days.
    Scanner s = new Scanner(System.in);
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    System.out.println("DATE BETWEEN:\nEnter first date in MM/dd/yyyy format:");
    LocalDate date1 = LocalDate.parse(s.nextLine(),sdf);
    System.out.println("Enter second date in MM/dd/yyyy format:");
    LocalDate date2 = LocalDate.parse(s.nextLine(),sdf);
    long daysBetween = ChronoUnit.DAYS.between(date1, date2);
    Integer days = (int) (long) daysBetween;
    return days;
  }
  
}
