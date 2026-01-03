
// Area Of Rectangle Program
// A= length * width

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length ");
        float l = in.nextFloat();
        System.out.print("Enter the width ");
        float w = in.nextFloat();
        float Area = l*w;
        System.out.println("Area of Rectangle is " + Area);
    }
}