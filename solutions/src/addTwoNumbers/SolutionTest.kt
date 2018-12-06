package addTwoNumbers

import org.junit.jupiter.api.Assertions.*

internal class SolutionTest {
    private val solution: Solution  = Solution()

    @org.junit.jupiter.api.Test
    fun contentEqualsCheck() {
        assertTrue(ListNode.create(intArrayOf(7,0,8)).contentEquals(ListNode.create(807)))
    }

    @org.junit.jupiter.api.Test
    fun example() {
        val result = solution.addTwoNumbers(ListNode.create(intArrayOf(2,4,3)), ListNode.create(465))!!
        assertTrue(result.contentEquals(ListNode.create(807)))
    }

    @org.junit.jupiter.api.Test
    fun differentLength() {
        val result = solution.addTwoNumbers(ListNode.create(intArrayOf(2,4)), ListNode.create(465))!!
        assertTrue(result.contentEquals(ListNode.create(507)))
    }

    @org.junit.jupiter.api.Test
    fun sumZero() {
        val result = solution.addTwoNumbers(ListNode.create(intArrayOf(0,0,0)), ListNode.create(123))!!
        assertTrue(result.contentEquals(ListNode.create(123)))
    }


    @org.junit.jupiter.api.Test
    fun sumZero2() {
        val result = solution.addTwoNumbers(ListNode.create(intArrayOf(0)), ListNode.create(123))!!
        assertTrue(result.contentEquals(ListNode.create(123)))
    }

    @org.junit.jupiter.api.Test
    fun finishWithRemain() {
        val result = solution.addTwoNumbers(ListNode.create(intArrayOf(5,5,5)), ListNode.create(555))!!
        assertTrue(result.contentEquals(ListNode.create(1110)))
    }


    @org.junit.jupiter.api.Test
    fun finishWithRemain2() {
        val result = solution.addTwoNumbers(ListNode.create(intArrayOf(1)), ListNode.create(99))!!
        assertTrue(result.contentEquals(ListNode.create(100)))
    }

}