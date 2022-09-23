import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class dates {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
       	System.out.println("Welcome to CISC3140 DATE TRACKER.");
	System.out.println("Today's Date: " + LocalDate.now());
        System.out.println("IS THIS CORRECT?\n1 for YES\n2 for NO");

        int ans = in.nextInt();

        LocalDate lab1 = LocalDate.of(2022, 9, 28);
        LocalDate lab2 = LocalDate.of(2022, 10, 26);
        LocalDate lab3 = LocalDate.of(2022, 11, 23);
        LocalDate lab4 = LocalDate.of(2022, 12, 7);


        if(ans == 1){
            LocalDate now = LocalDate.now();
            System.out.println("For Lab 1 there is: " + ChronoUnit.DAYS.between(now,lab1) + " days.");
            System.out.println("For Lab 2 there is: " + ChronoUnit.DAYS.between(now,lab2) + " days.");
            System.out.println("For Lab 3 there is: " + ChronoUnit.DAYS.between(now,lab3) + " days.");
            System.out.println("For Lab 4 there is: " + ChronoUnit.DAYS.between(now,lab4) + " days.");

        }
        if(ans == 2){
            System.out.println("Apologies for the error, please enter the YEAR, MONTH, and DAY consecutively when prompted.");
            LocalDate now = LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt());
            System.out.println("For Lab 1 there is: " + ChronoUnit.DAYS.between(now,lab1) + " days.");
            System.out.println("For Lab 2 there is: " + ChronoUnit.DAYS.between(now,lab2) + " days.");
            System.out.println("For Lab 3 there is: " + ChronoUnit.DAYS.between(now,lab3) + " days.");
            System.out.println("For Lab 4 there is: " + ChronoUnit.DAYS.between(now,lab4) + " days.");

        }
    in.close();
    }
}
