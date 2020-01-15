package perfectsquares;
/**
 * 解法二：动态规划
 * 递归的逆过程：
 * 递归方程已经得知:dp[n]=Math.min(dp[n],dp[n-j*j]+1) //j*j<=n
 * 则从1开始完善动态规划表求得dp[n]
 * @author 127
 *
 */

public class PerfectSquares_2 {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
