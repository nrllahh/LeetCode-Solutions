package Problem9_PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return original == reversed;
    }
}
