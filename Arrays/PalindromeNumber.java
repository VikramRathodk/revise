package Arrays;
public class PalindromeNumber {
    public static void main(String[] args) {
        // converting the Integer to String and finding the whether a number
        // is palindrome or not
        // System.out.println(isPalindrome(1021));

        // reversing the number and then checking the whether a number is palindrome or
        // not
        // System.out.println(isPalindromeByBruteForce(121));
        int givenPalindrome = 1255821;
        int closestGreaterPalindrome = findClosestGreaterPalindrome(givenPalindrome);

        System.out.println("Given Palindrome: " + givenPalindrome);
        System.out.println("Closest Greater Palindrome: " + closestGreaterPalindrome);

    }

    public static boolean isPalindrome(int n) {
        String numStr = Integer.toString(n);
        int start = 0;
        int end = numStr.length() - 1;

        while (start < end) {
            if (numStr.charAt(start) != numStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static int findClosestGreaterPalindrome(int n) {
        n++; // Increment the given number

        while (!isPalindrome(n)) {
            n++;

        }

        return n; // Found the next palindrome
    }

    // private static boolean isPalindromeByBruteForce(int n) {

    // if (n < 0 || (n != 0 && n % 10 == 0)) {
    // return false;
    // }
    // int rev = 0;
    // int orignal = n;

    // while(n>0){
    // int remainder = n % 10;
    // rev = rev * 10 + remainder;
    // n /= 10;
    // }

    // return rev == orignal;
    // }

    // public static boolean isPalindrome(int n) {

    // String number = Integer.toString(n);
    // int s = 0;
    // int e = number.length() - 1;

    // while (s < e) {
    // if (number.charAt(s) != number.charAt(e)) {
    // return false;
    // }
    // s++;
    // e--;
    // }

    // return true;
    // }
}
