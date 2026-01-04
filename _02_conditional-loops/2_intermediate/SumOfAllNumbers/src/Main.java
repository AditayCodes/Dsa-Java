import java.util.Scanner;
// Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers
// from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.print("Enter 0 to stop !! ");
        int num ;
        int sumn=0;
        int sume=0;
        int sumo=0;
        while(true){
            System.out.print("Enter 0 to stop !! ");
            num = in.nextInt();
            if (num == 0) {
                break;
            } else if (num<0 ) {
                sumn=num+sumn;
            } else {
                if (num %2== 0) {
                    sume=sume+num;
                }else {
                    sumo=sumo+num;
                }
            }
        }
        System.out.println("Sum of negative number is "+sumn);
        System.out.println("Sum of positive even numbers "+sume);
        System.out.println("Sum of positive odd number "+sumo);
    }
}