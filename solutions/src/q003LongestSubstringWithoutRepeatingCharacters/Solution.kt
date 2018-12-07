package q003LongestSubstringWithoutRepeatingCharacters

/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/

3. Longest Substring Without Repeating Characters
Medium

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxFoundSubstringLength = 0
        var i = 0
        while(i < s.length) {
            if (i + maxFoundSubstringLength >= s.length) {
                break
            }
            val foundCharCollection: MutableList<Char> = mutableListOf(s[i])
            for (j in i + 1 until s.length) {
                val currentChar = s[j]
                val foundIndex = foundCharCollection.indexOf(currentChar)
                if (foundIndex >= 0) {
                    i += foundIndex
                    break
                } else {
                    foundCharCollection.add(currentChar)
                }
            }

            if (foundCharCollection.size > maxFoundSubstringLength)
                maxFoundSubstringLength = foundCharCollection.size
            i++
        }
        return maxFoundSubstringLength
    }
}