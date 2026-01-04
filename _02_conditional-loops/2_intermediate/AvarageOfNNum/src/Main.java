import java.util.Scanner;

// Calculate Average Of N Numbers
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total values ");
        int total = in.nextInt();
        if (total == 0) {
            System.out.println("Cant find average of zero ");
        }
        else {
            int sum = 0;
            for (int i = 0; i < total; i++) {
                System.out.print("Number "+(i+1) +" is ");
                int num = in.nextInt();
                sum = sum + num;
            }
            double average = (double) sum / total;
            System.out.print("Avarage of " + total + " numbers is " + average);
        }
    }
}