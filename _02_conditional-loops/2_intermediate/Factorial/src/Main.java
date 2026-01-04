import java.util.Scanner;

// Factorial Program In Java
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = in.nextInt();
        if (num < 0) {
            System.out.println("Enter valid number");
        }
        else{
            int Fact = 1 ;
            if (num == 0) {
                System.out.print("invalid 0 ");
            }
            else {
                while(num>0){
                    Fact= num * Fact;
                    num= num-1;
                }
                System.out.print("Factorial is "+ Fact);
            }
        }
    }
}