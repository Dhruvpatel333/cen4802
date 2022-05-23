package fibSeqeunceRecursive;


import java.util.Scanner;
import java.util.*;

/**
 * @author Dhruv
 *
 * In this assignment an recursive function is used to show the term at the nth position in a Fibonacci Sequence
 */
public class fibonacciSeq{

		/**
		 * @param n
		 * @return This will return the result of the sequence after reaching the nth term.
		 */
		public static int fib(int n) {
			if(n ==0 )
				return n;
			else if (n == 1)
				return n;
			else	
				return fib(n - 1) + fib(n -2);
		
				
		}
		

		public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			
			int number = input.nextInt();
		
			int num = fib(number);
			
			System.out.println("The fibonacci term at " + number + " is "+ num);
			
			
		}

		
}

