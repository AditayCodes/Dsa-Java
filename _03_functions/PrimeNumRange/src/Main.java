import java.util.Scanner;

// Write a function that returns all prime numbers between two given numbers.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number ") ;
        int n1=in.nextInt();
        System.out.print("Enter last number ") ;
        int n2=in.nextInt();
        prime(n1,n2);
    }
    static void prime(int n1,int n2){
        if (n1 >n2) {
            System.out.println("Enter the valid range ");
            return;
        }
        boolean isFound=false;
        for (int i = n1; i <=n2 ; i++) {
            if (i <= 1) {
                continue;
            }
            boolean isPrime= true;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if (i %j==0) {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
                isFound=true;
            }
        }
        if (!isFound) {
            System.out.println("No prime number in range ");
        }
    }
}