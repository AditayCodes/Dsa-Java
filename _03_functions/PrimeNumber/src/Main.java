import java.util.Scanner;

// Define a method to find out if a number is prime or not.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number ") ;
        int n1=in.nextInt();
        prime(n1);
    }
    static void prime(int a){
        if (a <= 1) {
            System.out.println("Not prime");
            return;
        }
        boolean isPrime= true;
        for (int i = 2; i <=a/2 ; i++) {
            if (a%i == 0) {
                isPrime=false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime ");
        }
    }
}