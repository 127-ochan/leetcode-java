package maximum_subarray_53;

/**
 * 解法二：前缀和法
 * 最大子序列和其实为各处序列和与之前各处序列和最小值之差的最大值
 * 
 * 要点：无需用数组存储各处序列和
 * 采用两个变量，分别存储当前位置之前的序列和最小值和差值的最大值--节省空间值为O(1)
 * @author 127
 *
 */

public class MaximumSubarray_2 {
	public int maxSubArray(int[] nums) {
        int size=nums.length;
        if(size==1) return nums[0];
        int max=Integer.MIN_VALUE;
        int min=0;
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=nums[i];
            max=Math.max(max,sum-min);
            min=Math.min(min,sum);
        }
        return max;
    }
}
