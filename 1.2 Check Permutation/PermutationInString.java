/*Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2. */

import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        boolean answer = false;
        int [] alphabet = new int[26];
        int [] alphabetCompare = new int[26];

        for(int j = 0; j < s1.length(); j++){
            alphabetCompare[s1.charAt(j) - 'a']++;
        }

        for(int i = 0; i <= s2.length() - s1.length(); i++) {

            for(int j = 0; j < s1.length(); j++){

                alphabet[ s2.charAt(i + j)-  'a']++;

            }

            if (Arrays.equals(alphabet, alphabetCompare))
                answer = true;
            else 
                Arrays.fill(alphabet, 0);
        }
        return answer;
    }
}
