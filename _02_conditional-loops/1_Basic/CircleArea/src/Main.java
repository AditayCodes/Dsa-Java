
// Area Of Circle Java Program
//A= pi*2*2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius ");
        float r = in.nextFloat();
        float Area = (float)3.14*(r*r);
        System.out.println("Area of circle is " + Area);
    }
}