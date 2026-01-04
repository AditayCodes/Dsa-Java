import java.util.Scanner;
// Check Leap Year Or Not
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int year = in.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0 ) {
            System.out.println(year+" is leap year");
        }
        else {
            System.out.println(year+"  is not a leap year");
        }
    }
}