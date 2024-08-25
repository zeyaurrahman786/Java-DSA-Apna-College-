/*
    Question 1 : Check if a String is a Palindrome
    "racecar", "noon", "madam" 
*/

package Strings;

public class Six_Palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) == str.charAt(n - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}


// Time Complexity :- O(n) Kyuki ek loop chala hai isme