
/**
 * ALGORIHM factorialCalculator(n)
 *  n: a positive integer input from the user
 *      calculates factorial of n using recursion
 *      displays the result
 * if n is 0, returns 1
 * if n is 1, returns 1
 * otherwise,
 *  returns n*factorial(n-1)
 *      the main() checks for number integrity, checks for factorial
 *      by calling factorial(n), and displays output message accordingly
 */

import java.util.Scanner;
class factorialCalculator {
    public int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n = in.nextInt();
        factorialCalculator obj = new factorialCalculator();
        if (n < 0)
            System.out.println(+n + " is not a positive number. Please enter a positive number.");
        else
            System.out.println("The factorial of " + n + " : " + obj.factorial(n));
        in.close();
    }
}