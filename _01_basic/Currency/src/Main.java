
// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rupees ");
        float ind = in.nextFloat();
        float change = 83.0f;
        float usd;
        usd = ind / change;
        System.out.println(ind +" rupees = "+ usd + " usd") ;
    }
}