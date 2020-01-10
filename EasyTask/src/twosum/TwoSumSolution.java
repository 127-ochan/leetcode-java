package twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * 解法一：暴力解 时间O(N^2) 空间O(1)
 * 解法二：两遍哈希表 空间换时间 时间O(N) 空间O(N)
 * 解法三：一遍哈希表 时间O(N) 空间O(N)
 * 要点：1.哈希表key为数组元素，value为下标
 * 		  即使数组元素有重复，哈希表覆盖后并不影响返回值的正误
 * 		2.throw new IllegalArgumentException();
 * @author 127
 *
 */

public class TwoSumSolution {
	public int[] twoSum(int[] nums, int target){
		int size=nums.length;
        Map<Integer,Integer> numsMap=new HashMap<>(size);
        for(int i=0;i<size;i++){
            int complement=target-nums[i];
            if(numsMap.containsKey(complement)&&numsMap.get(complement)!=i)   
            {
                int[] index={numsMap.get(complement),i};
                return index;
            }
            numsMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
