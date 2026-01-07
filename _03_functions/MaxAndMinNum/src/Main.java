import java.util.Scanner;

// Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number ") ;
        int n1=in.nextInt();
        System.out.print("Enter second number ") ;
        int n2=in.nextInt();
        System.out.print("Enter third number ") ;
        int n3=in.nextInt();
        System.out.println();
        int maxRes = max(n1,n2,n3);
        int minRes = min(n1,n2,n3);
        System.out.println("The Largest number is " +maxRes);
        System.out.println("The Smallest number is " +minRes);
    }
    static int  max(int n1,int n2,int n3){
        int maxRes=n1;
        if (maxRes < n2) {
            maxRes=n2;
        }
        if(maxRes<n3){
            maxRes =n3;
        }
        return maxRes;

    }
    static int min(int n1,int n2,int n3){
        int minRes=n1;
        if (minRes > n2) {
            minRes=n2;
        }
        if(minRes>n3){
            minRes =n3;
        }
        return minRes;
    }
}