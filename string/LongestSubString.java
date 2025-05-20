package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString {
    // Function to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128]; // Assuming ASCII characters

        for (int i = 0, j = 0; j < n; j++) {
            i = Math.max(charIndex[s.charAt(j)], i);
            maxLength = Math.max(maxLength, j - i + 1);
            charIndex[s.charAt(j)] = j + 1; // Update the last index of the character
        }
        return maxLength;
    }

    // Alternative strategy using HashSet and sliding window
    public static int longestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0, right = 0;
        Set<Character> seen = new LinkedHashSet<>();

        while (right < n) {
            char c = s.charAt(right);
            if (!seen.contains(c)) {
                seen.add(c);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abbcabcbb"; // Example string
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(str));
        System.out.println("Length of the longest substring without repeating characters: " + longestSubstring(str));
    }
}
