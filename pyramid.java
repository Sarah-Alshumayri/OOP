/**
 * Lab 1 Problem 4
 * @author (Passent Elkafrawy)
 * @version (29/1/2023)
 * Student Name: Sarah Alshumayri
 * Student ID: S20106125
 */

package mypack;
import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter the number of lines (1-15): ");
            n = input.nextInt();

            if (n > 15 || n < 1) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (n > 15 || n < 1);

        for (int i = n; i >= 1; i--) {
            for (int j1 = i; j1 >= 1; j1--) {
                System.out.print(j1);
            }
            for (int j2 = 2; j2 <= i; j2++) {
                System.out.print(j2);
            }
            System.out.println();
        }
    }
}