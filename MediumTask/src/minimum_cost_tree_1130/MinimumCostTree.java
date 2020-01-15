package minimum_cost_tree_1130;

import java.util.Stack;

/**
 * 解法一：单调栈方法
 * 在数组中每次取相邻的两个数a、b，去掉其中较小的一个数，花费的代价是a*b，
 * 求最终将数组消减为一个元素的最小代价
 * 解决方法：单调递减栈。压入的数组元素大于栈顶元素时，
 * 将栈顶元素与压入数组元素和堆栈相邻元素中小的那个相乘后压入数组元素。
 * 时间复杂度：O(N)
 * @author 127
 *
 */
public class MinimumCostTree {
	 public int mctFromLeafValues(int[] arr){
	        int sum=0;
	        int size=arr.length;
	        Stack<Integer> arrStack=new Stack<>();
	        arrStack.push(Integer.MAX_VALUE);
	        for(int i=0;i<size;i++){
	            while(arr[i]>arrStack.peek()){
	                sum+=arrStack.pop()*Math.min(arrStack.peek(),arr[i]);
	            }
	            arrStack.push(arr[i]);
	        }
	        while(arrStack.size()>2){
	            sum+=arrStack.pop()*arrStack.peek();
	        }
	        return sum;
	    }
}
