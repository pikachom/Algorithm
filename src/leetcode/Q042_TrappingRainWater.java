package leetcode;

/*
* Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

* Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

* Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9
 * */

public class Q042_TrappingRainWater {
    public int trap(int[] height) {
        int leftMax = 0, rightMax = 0;
        int leftIdx = 0;
        int rightIdx = height.length - 1;
        int ans = 0;
        while(leftIdx <= rightIdx){
            leftMax = Math.max(leftMax, height[leftIdx]);
            rightMax = Math.max(rightMax, height[rightIdx]);
            if(leftMax < rightMax){
                ans += leftMax - height[leftIdx];
                leftIdx++;
            }else{
                ans += rightMax - height[rightIdx];
                rightIdx--;
            }
        }
        return ans;
    }
}
/*
* idea :
* leftMax < rightMax 인 상황이면(오른쪽의 최대높이가 더 높은 상태면)
* left idx쪽에 물이 leftmax - height[leftidx] 만큼 고이기 때문에
* time : O(N)
*
* */