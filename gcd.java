/**
 * Lab 1 Problem 3
 * @author (Passent Elkafrawy)
 * @version (29/1/2023)
 * Student Name: Sarah Alshumayri
 * Student ID: S20106125
 */

package mypack;
import java.util.Scanner;

public class gcd {

    public static int Max (int x, int y) {
        if( x < y)
            return y;
        else
            return x;
    }
    public static int Min (int x, int y) {
        if( x > y)
            return y;
        else
            return x;
    }
    
    public static void main(String[] args) 

    {
// The user will write two numbers in order the find the gcd of them
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int n2 = input2.nextInt();

        int gcd = 0;
        int min = Min (n1,n2);
        int max = Max(n1,n2);

        for (int d = min; d >= 1; d--) {
            if(n1 % d == 0 && n2 % d ==0) {
                gcd = d;
                break;
            }
        }
        if (gcd > 0) {
            System.out.print("gcd is: "+gcd);
        } else {
            System.out.print("There is no gcd for "+n1+" and "+n2);
        }
    }
}
