import java.util.Scanner;

// Power In Java
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = in.nextInt();
        if (num == 0) {
            System.out.println("Power of 0 is 1 ");
        }
        else {
            System.out.print("Enter the power ");
            int pow = in.nextInt();
            double res;
            res = Math.pow(num, pow);
            System.out.println(res);
        }
    }
}