
// Area Of Triangle Java Program
// A= 1/2*base*height

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base ");
        float b = in.nextFloat();
        System.out.print("Enter the height ");
        float h = in.nextFloat();
        float Area = (float)1/2*b*h;
        System.out.println("Area of circle is " + Area);
    }
}