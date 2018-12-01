package twoSum

/*
https://leetcode.com/problems/two-sum/
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */


class Solution() {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0 until nums.size){
            for (j in i + 1 until nums.size){
                if(nums[i]+nums[j] == target){
                    return intArrayOf(i,j)
                }
            }
        }
        return intArrayOf()
    }

}


