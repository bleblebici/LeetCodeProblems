package q003LongestSubstringWithoutRepeatingCharacters

import org.junit.jupiter.api.Assertions.*
import q002AddTwoNumbers.ListNode

class SolutionTest {
    private val solution: Solution  = Solution()

    @org.junit.jupiter.api.Test
    fun example1() {
        val result = solution.lengthOfLongestSubstring("abcabcbb")
        assertTrue(result == 3) //"abc"
    }

    @org.junit.jupiter.api.Test
    fun example2() {
        val result = solution.lengthOfLongestSubstring("bbbbb")
        assertTrue(result == 1) //b
    }

    @org.junit.jupiter.api.Test
    fun example3() {
        val result = solution.lengthOfLongestSubstring("pwwkew")
        assertTrue(result == 3) //wke
    }

    @org.junit.jupiter.api.Test
    fun startWithADuplicate() {
        val result = solution.lengthOfLongestSubstring("abcabcdbb")
        assertTrue(result == 4) //abcb
    }


    @org.junit.jupiter.api.Test
    fun containsADuplicateChar() {
        val result = solution.lengthOfLongestSubstring("abcadbcbb")
        assertTrue(result == 4) //bcad
    }


    @org.junit.jupiter.api.Test
    fun duplicateJump() {
        val result = solution.lengthOfLongestSubstring("abccabdebcbb")
        assertTrue(result == 5) //cabde
    }

    @org.junit.jupiter.api.Test
    fun emptyString() {
        val result = solution.lengthOfLongestSubstring("")
        assertTrue(result == 0) //
    }



}