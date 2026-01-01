
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        System.out.print("Enter the first number ");
        double n1 = in.nextInt();
        System.out.print("Enter the second number ");
        double n2 = in.nextInt();
        System.out.print("Select the operators [ + , - , * , / ]  ");
        char op = in.next().charAt(0);
        double result;
        if (op == '+') {
            result= n1+n2;
            System.out.print(result);
        }
        else if (op == '-') {
            result= n1-n2;
            System.out.print(result);
        }
        else if (op == '*') {
            result= n1*n2;
            System.out.print(result);
        }
        else if (op == '/') {
            result= n1/n2;
            if (n2 == 0) {
                System.out.println("Cannot divide by zero/0 ");
            }else {
                System.out.print(result);
            }
        }
        else {
            System.out.println("Out of the range");
        }
    }
}