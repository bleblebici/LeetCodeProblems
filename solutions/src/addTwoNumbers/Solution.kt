package addTwoNumbers

/*
https://leetcode.com/problems/add-two-numbers/

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var resultFirstNode : ListNode? = null
        var currentNode : ListNode? = null
        var l1Current = l1
        var l2Current = l2
        var currentRemaining = 0
        while(l1Current != null || l2Current != null){
            val total  = (l1Current?.`val` ?: 0) + (l2Current?.`val` ?: 0) + currentRemaining
            val digit  = total.rem(10)
            if(currentNode == null){
                resultFirstNode = ListNode(digit)
                currentNode = resultFirstNode
            }
            else{
                currentNode.next = ListNode(digit)
                currentNode = currentNode.next
            }
            currentRemaining = if(total != digit) 1 else 0
            l1Current = l1Current?.next
            l2Current = l2Current?.next
        }
        if(currentRemaining > 0){
            currentNode?.next = ListNode(currentRemaining)
        }
        return resultFirstNode
    }
}