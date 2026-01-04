import java.util.Scanner;
// Sum Of N Numbers
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total values ");
        int total = in.nextInt();
        if (total == 0) {
            System.out.println("sum of 0 is zero ");
        }
        else {
            int sum = 0;
            for (int i = 0; i < total; i++) {
                System.out.print("Number "+(i+1) +" is ");
                int num = in.nextInt();
                sum = sum + num;
            }
            System.out.print("Sum of " + total + " numbers are " +sum );
        }
    }
}