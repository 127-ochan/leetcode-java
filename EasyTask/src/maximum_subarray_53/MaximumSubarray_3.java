package maximum_subarray_53;
/**
 * 解法三：动态规划
 * 找到状态转移方程，当前位置的i的最大子序列和dp[i]
 * 要点：1.dp[i]=max(dp[i-1]+nums[i],nums[i])
 * 		  dp[0]=nums[0]
 *      2.同样无需数组保存，只需要用两个值保存最大子序列和中的最大值和当前序列的最大子序列和
 * 
 * @author 127
 *
 */

public class MaximumSubarray_3 {
	 public int maxSubArray(int[] nums) {
	        if(nums==null||nums.length==0) return 0;
	        int size=nums.length;
	        int curMax=0;
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<size;i++){
	            curMax=Math.max(curMax+nums[i],nums[i]);
	            max=Math.max(max,curMax);
	        }
	        return max;
	    }
}
