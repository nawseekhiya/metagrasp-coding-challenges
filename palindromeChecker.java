/**
 * ALGORITHM palindromeChecker()
 * s: takes a  string as input
 *      removes punctations, spaces, capitalizations
 *      checks for palindrome
 *      prints whether the string given by user is palindrome or not
 * 
 * reString <- s.replaceAll("[\\W]","").toLowerCase();
 * l <- 0; r <- reString.length()-1;
 * while l<r
 *      if reString.charAt(left) != reString.charAt(right)
 *          returns false
 *      l++; r--;
 * otherwise, returns true
 * the function is called in void main(), which displays the output message
*/

import java.util.*;
public class palindromeChecker {
    //  the function refines the string input, and checks for palindrome
    public boolean isPalin(String input) {
        String reString = input.replaceAll("[\\W]","").toLowerCase();
        int leftIndex=0;
        int rightIndex=reString.length()-1;

        //  performing palindrome checking algorithm to find each character from two different
        //  different sequence (left and right) are matching or not, and then incrementing the left
        //  index value and decrementing the right index value until left index value is smaller
        //  than right index which means the loop will stop before the left index surpasses the 
        //  the placement of right index bound. if the characters doesnt match, the function returns false.
        //  if the character matches for all iterations of loop, the function returns true.
        while (leftIndex < rightIndex) {
            if (reString.charAt(leftIndex) != reString.charAt(rightIndex))
                return false;
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  gets the user input
        System.out.println("Enter the string to check for Palindrome: ");
        String userInput = in.nextLine();
        palindromeChecker obj = new palindromeChecker();
        //  displays output message based on isPalin() return value
        if (obj.isPalin(userInput))
            System.out.println("The input string " + userInput + " is a Palindrome.");
        else
            System.out.println("The input string " + userInput + " is not a Palindrome.");
        in.close();
    }
}
