package maximum_subarray_53;
/**
 * 解法一：分治法
 * 将序列分为左子序列、右子序列和中间子序列
 * 则最大子序列和是各子序列的最大子序列和中的最大值
 * 
 * 要点：中间子序列和归结为左子序列后缀和最大值+右子序列前缀和最大值+中间值，
 * @author 127
 *
 */
public class MaximumSubarray {
	 public int maxSubArray(int[] nums) {
	        if(nums==null||nums.length==0) return 0;
	        int size=nums.length;
	        int max=findMax(nums,0,size-1);
	        return max;
	    }
	    int findMax(int[] nums,int l,int r){
	        if(l>r) return Integer.MIN_VALUE;
	        int mid=(l+r)>>>1;
	        /*
	        求出左右序列的最大值left、right;
	        */
	        int left=findMax(nums,0,mid-1);
	        int right=findMax(nums,mid+1,r);
	        /*
	        求出中间序列的最大值，即左侧最大后缀和与mid处元素与右侧最大前缀和之和;
	        */
	        int leftMax=0;
	        int sum=0;
	        for(int i=mid-1;i>=l;i--){
	            sum+=nums[i];
	            leftMax=Math.max(leftMax,sum);
	        }
	        int rightMax=0;
	        sum=0;
	        for(int i=mid+1;i<=r;i++){
	            sum+=nums[i];
	            rightMax=Math.max(rightMax,sum);
	        }
	        return Math.max(leftMax+rightMax+nums[mid],Math.max(left,right));
	    }
}
