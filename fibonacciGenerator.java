/**
 * ALGORITHM fibonacciGenerator(n)
 *  n: positive integer given by user to generate first n sequence of fibonacci
 *      if n is 0, returns 0
 *      if n is 1, returns 1
 *      else returns fibonacci(n-1) + fibonacci(n-2)
 *  generates the sequences by recursive call of function fibonacci()
 * the void main() function takes input from user as n,
 *      if the n is less than 0, it is negative, therefore invalid input
 *      otherwise, prints the fibonacci sequence by iterative call of fibonacci() from 0 to n-1
 */

import java.util.*;
class fibonacciGenerator {
    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n=in.nextInt();
        fibonacciGenerator obj = new fibonacciGenerator();
        if(n<0)
            System.out.println("Not a positive number. Please enter a positive integer.");
        else {
            System.out.println("Fibonacci sequence upto "+n+" terms:");
            for(int i=0;i<n;i++)
                System.out.print(obj.fibonacci(i)+"\t");
        }
        in.close();
    }
}