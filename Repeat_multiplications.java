/**
 * Lab 1 Problem 2
 * @author (Passent Elkafrawy)
 * @version (29/1/2023)
 * Student Name: Sarah Alshumayri
 * Student ID: S20106125
 */

package mypack;
import java.util.Scanner;

public class Repeat_multiplications {
  public static void main(String[] args) {
    final int NUMBER_OF_QUESTIONS = 15; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int count = 0; // Count the number of questions
    long startTime = System.currentTimeMillis();
    String output = ""; // output string is initially empty
    Scanner input = new Scanner(System.in);

    while (count < NUMBER_OF_QUESTIONS) {
      int number1 = (int)(Math.random() * 12);
      int number2 = (int)(Math.random() * 12);
      int operation = (int)(Math.random() * 2); // 0 for subtraction, 1 for multiplication
      int answer;
      
      if (operation == 0) {
        if (number1 < number2) {
          int temp = number1;
          number1 = number2;
          number2 = temp;
        }
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        answer = input.nextInt();
        if (number1 - number2 == answer) {
          System.out.println("You are correct!\n");
          correctCount++;
        } else {
          System.out.println("Your answer is wrong.\n" + number1 
            + " - " + number2 + " should be " + (number1 - number2) + "\n");
        }
      } else {
        System.out.print("What is " + number1 + " * " + number2 + "? ");
        answer = input.nextInt();
        if (number1 * number2 == answer) {
          System.out.println("You are correct!\n");
          correctCount++;
        } else {
          System.out.println("Your answer is wrong.\n" + number1 
            + " * " + number2 + " should be " + (number1 * number2) + "\n");
        }
      }
      count++;
      output += "\n" + number1 + (operation == 0 ? "-" : "*") + number2 + "=" + answer + 
        (((operation == 0 ? number1 - number2 : number1 * number2) == answer) ? " correct" : " wrong");
    }
    long endTime = System.currentTimeMillis();
    long testTime = endTime - startTime;

    System.out.println("Correct count is " + correctCount + 
      "\nTest time is " + testTime / 1000 + " seconds\n" + output);
  }
}

