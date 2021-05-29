package leetcode;


import java.util.HashMap;

/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*
* */
public class Q001_TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        //Map<value, index>
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff) && map.get(diff) != i){
                result[0] = i;
                result[1] = map.get(diff);
            }
        }
        return result;
    }
}
/*
* 아이디어 : map을 <value, index> 로 둬서 검사하기 편리하게 했음
* time : O(N)
* */