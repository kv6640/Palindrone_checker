/**
 * ==========================================================================
 *                     MAIN CLASS - UseCase3PalindromCheckerApp
 * ==========================================================================
 * Use Case 4: Character Array Based validation
 *
 * Description
 * This class validates a p[alindrome by coverting string into a char
 * array and comapring using  two pointers
 *
 * At this stage, the application:
 * - converts string to char array
 * - uses start and end poineters
 * - compares characters
 * - Displays the result
 *
 * This reduces extra memory usages
 *
 */


public class PalindroneChecker {
    public static void main(String[] args) {
        String input = "racecar";


        char[] charArray = input.toCharArray();


        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;


        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
