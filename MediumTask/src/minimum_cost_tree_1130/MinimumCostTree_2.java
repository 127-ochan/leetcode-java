package minimum_cost_tree_1130;
/**
 * 解法二：动态规划
 * 状态转移方程：分为左侧和右侧两个部分，则当前的最小叶值等于左右侧最小叶值加上左右侧最大值乘积
 * 时间复杂度：O(N^3)
 * 要点：为避免重复计算，可设置一二维数组记录起点终点确定的某数组的最小叶和(否则超出时间限制)
 * @author 127
 *
 */
public class MinimumCostTree_2 {
	 private int[][] memo;
	 public int mctFromLeafValues(int[] arr){
	        int sum=0;
	        int size=arr.length;
	        if(size==0||arr==null) return 0;
	        memo=new int[size][size];
	        return findMinSum(arr,0,size);
	    }
	    int findMaxNum(int[] arr,int start,int end){
	        int max=Integer.MIN_VALUE;
	        for(int i=start;i<end;i++){
	            max=Math.max(max,arr[i]);
	        }
	        return max;
	    }
	    int findMinSum(int[] arr,int start,int end){
	        int sum=Integer.MAX_VALUE;
	        int temp=Integer.MAX_VALUE;
	        if(start==end-1){
	            return 0;
	        }
	        if(memo[start][end]!=0) return memo[start][end];
	        for(int i=start+1;i<end;i++){
	            temp=findMinSum(arr,start,i)+findMinSum(arr,i,end)+findMaxNum(arr,start,i)*findMaxNum(arr,i,end);
	            sum=Math.min(temp,sum);
	        }
	        memo[start][end]=sum;
	        return sum;
	    }
}
