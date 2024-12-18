package Problem3_LongestSubstringWithoutRepeatingCharacter;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength=0;
        Set<Character> characters = new HashSet<Character>();
        for (int right = 0; right < s.length(); right++) {

            while (characters.contains(s.charAt(right))) {
                characters.remove(Character.valueOf(s.charAt(left)));

                left++;
            }
            characters.add(s.charAt(right));

            maxLength= Math.max(maxLength,right - left +1 );
        }

        return maxLength;
    }

}