
/**
 * ALGORITHM vowelCounter(s)
 *  s: a String input from user may/may not consist vowels
 *      checks for presence of vowels in the string
 *      counts if found vowel
 * count <- 0
 * convert the string to lowercase
 * collecting character by using a loop
 * if character is 'a' or 'e' or 'i' or 'o' or 'u'
 *      increment the counter
 * returns counter
 * the main() takes string as input from user
 * gets the value of the counter from vowelCounter()
 * displays the no. of vowels with appropriate output message
 */

import java.util.Scanner;
class vowelCounter {
    public int vCounter(String s) {
        int c = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++; // incrementing vowel counter if vowel found
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string (word or sentence) : ");
        String s = in.nextLine();
        vowelCounter obj = new vowelCounter();
        int vowels = obj.vCounter(s);
        if (vowels < 0)
            System.out.println("No vowels found.");
        else
            System.out.println(+vowels + " vowels found.");
        in.close();
    }
}