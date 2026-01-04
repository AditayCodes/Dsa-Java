import java.util.Scanner;
// Compound Interest Java Program
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pri ;
        double t ;
        double rate;
        System.out.print("Enter the principal amount ");
        pri = in.nextFloat();
        System.out.print("Enter the time ");
        t = in.nextFloat();
        System.out.print("Enter the rate of interest ");
        rate = in.nextFloat();
        double a = (1+rate/100);
        double ci = pri* Math.pow(a,t)-pri;
        System.out.println("compound interest is " + ci);
    }
}

