/**Problem Description

Given a string s, you need to determine if any rearrangement (permutation) of the characters in the string can form a palindrome. Return true if it's possible to rearrange the characters to create a palindrome, and false otherwise.

A palindrome is a string that reads the same forward and backward. For example, "racecar" and "noon" are palindromes.

The key insight is that for a string to be rearrangeable into a palindrome:

    If the string has even length, every character must appear an even number of times
    If the string has odd length, exactly one character can appear an odd number of times (this will be the middle character), while all others must appear an even number of times

For example:

    "aab" can form "aba" which is a palindrome, so return true
    "code" cannot form any palindrome arrangement because we have 4 different characters each appearing once, so return false
*/

public class PalindromePermutation {
    public boolean canPermutePalindrome (String s) {

        boolean answer = true;
        int [] alphabet = new int[26];
        int singleFrequencyCounter = 0;
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            alphabet [s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alphabet.length && singleFrequencyCounter <= 1; i++) {
            if(alphabet[i] % 2 == 1) 
                singleFrequencyCounter++;     
        }

        if(singleFrequencyCounter >= 2)
            answer = false;

        return answer;
    }
}