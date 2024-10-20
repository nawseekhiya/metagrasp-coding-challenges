/**
 * ALGORITHM anagramChecker(s1,s2)
 *  s1: a string taken as input from user
 *  s2: a string taken as input from user
 *       refines the string (like converting to lowercase, removing whitespaces)
 *       compares length of both strings (not equal means they cannot be anagram)
 *       sorts both the strings
 *       compares if they are equal (equal means anagram)
 * the main() takes two user inputs as two individual strings,
 * compares if anagram by calling anagramChecker() parameterized with s1,s2
 * displays the output message appropriately
 */

import java.util.Arrays;
import java.util.Scanner;

class anagramChecker {
    public boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string1: ");
        String s1 = in.nextLine();
        System.out.println("Enter the string2: ");
        String s2 = in.nextLine();
        anagramChecker obj = new anagramChecker();
        if (obj.areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
        in.close();
    }
}