/**
 * Lab 1 Problem 1
 * @author (Passent Elkafrawy)
 * @version (29/1/2023)
 * Student Name: Sarah Alshumayri
 * Student ID: S20106125
 */
package mypack;

public class oop {

	public static boolean  isPrime(int x) 
	{
		boolean prime = true;
		if ( x < 2 )return prime;

		for (int i = 2; i <= (x/2); i++)
			if (x % i == 0)
			{
				prime = false;
				break;
			}
		return prime;
	}
public static void main(String[]args) {
	int MAX = 50;
	int n =0; //1..50
	boolean prime = true;
	int counter =0;
	
	for(n = 1; n <= MAX; n++)
	{
		prime = isPrime(n);
		if(prime)
		{
			System.out.print(n);
			counter+=1;
			if(counter % 10 == 0 ) 
			System.out.println();
			else
				System.out.print(" ");

			}
		}
	}
}

