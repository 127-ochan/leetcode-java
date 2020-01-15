package perfectsquares;

/**
 * 解法一：递归法
 * 递归方程为count=Math.min(count,numSquares(n-j*j)+1);
 * 注意增加一个缓存存储已经计算过的值，否则会超出时间限制
 * @author 127
 *
 */

public class PerfectSquares {
	 private int[] dp;
	    public int numSquares(int n) {
	        dp=new int[n+1];
	        return findMin(n);
	    }
	private int findMin(int n){
	        if(dp[n]!=0) return dp[n];
	        int count=Integer.MAX_VALUE;
	        for(int j=1;j*j<=n;j++){
	        	if(j*j==n) return dp[n]=1;
	            count=Math.min(count,findMin(n-j*j)+1);
	        }
	        return dp[n]=count;
	 }
}
