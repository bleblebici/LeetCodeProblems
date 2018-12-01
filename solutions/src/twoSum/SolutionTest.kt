package twoSum

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    private val solution: Solution  = Solution()

    @org.junit.jupiter.api.Test
    fun example() {
        val result = solution.twoSum(intArrayOf(2,7,11,15),9)
        assert(result contentEquals  intArrayOf(0,1))
    }

    @org.junit.jupiter.api.Test
    fun example_Alternative() {
        val result = solution.twoSum(intArrayOf(2,7,11,15),18)
        assert(result contentEquals  intArrayOf(1,2))
    }


    @org.junit.jupiter.api.Test
    fun example_NoResult() {
        val result = solution.twoSum(intArrayOf(2,7,11,15),21)
        assert(result contentEquals  intArrayOf())
    }


    @org.junit.jupiter.api.Test
    fun notSortedArray() {
        val result = solution.twoSum(intArrayOf(3,2,4),6)
        assert(result contentEquals  intArrayOf(1,2))
    }
}