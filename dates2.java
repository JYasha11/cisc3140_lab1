import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class dates2 {

  public static void main (String [] args){
    /*int daysOne = methodOne();
    if(daysOne>0){
      System.out.println("It has been " + daysOne + " since dates given.");
    } else {
      System.out.println("It has been " + daysOne*-1 + " since dates given.");
    }*/
    methodTwo();
  }

  public static int methodOne () {
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

  public static int methodOneAuto (String date1, String date2) {
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    LocalDate dateOne = LocalDate.parse(date1,sdf);
    LocalDate dateTwo = LocalDate.parse(date2,sdf);
    long daysBetween = ChronoUnit.DAYS.between(dateOne, dateTwo);
    Integer days = (int) (long) daysBetween;
    return days;
  }

  public static void methodTwo() {
    //allow user to select between available saved dates (assignment due dates, 
    //quiz dates, and final dates) or enter their own date
    Scanner s = new Scanner(System.in);
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/dd/uuuu");
    String [] lab = {"09/28/2022", "10/26/2022", "11/23/2022", "12/07/2022"};
    String [] quiz = {"09/14/2022","09/28/2022","10/26/2022", "11/16/2022", "12/07/2022"};
    System.out.println("What category would you like to work with?\n1. Labs\t2. Quizzes");
    int choice = s.nextInt();

    if(choice==1) {
      for(int i = 0; i<lab.length; i++){
        LocalDate date = LocalDate.parse(lab[i],sdf);
        int count = i+1;
        System.out.println("Lab #" +count+ " " +date);
      }
      System.out.println("Select what two dates you want to find distance between. Select numbers '1-4' for labs.");
      System.out.println("Enter Date 1: ");
      int num1 = s.nextInt();
      System.out.println("Enter Date 2: ");
      int num2 = s.nextInt();
      System.out.println(methodOneAuto(lab[num1-1], lab[num2-1])+ " days.");

    } else if(choice==2){
      for(int i = 0; i<quiz.length; i++){
        LocalDate date = LocalDate.parse(quiz[i],sdf);
        int count = i+1;
        System.out.println("Quiz #" + count+ " " +date);
      }
      System.out.println("Select what two dates you want to find distance between. Select numbers '1-5' for quizzes.");
      System.out.println("Enter Date 1: ");
      int num1 = s.nextInt();
      System.out.println("Enter Date 2: ");
      int num2 = s.nextInt();
      System.out.println(methodOneAuto(quiz[num1-1], quiz[num2-1])+ " days.");
    } else {
      System.err.println("Error. Invalid Option");
    }
    

  }
  
}
