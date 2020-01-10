package longestsubstring_3;
/**
 * 解法一：暴力解法，逐个检查每个子串
 * 解法二：滑动窗口法
 * 		维护一个滑动窗口，窗口内无重复的字符，
 * 		如果当前遍历的字符从未出现过，那么扩大右边界
 * 		如果当前遍历到的字符出现过，则缩小窗口（左边界），继续观察当前遍历得到的字符
 * 		重复直至左边界无法移动
 * 		维护一个结果res
 * 
 * 要点：用set或map存储滑动窗口
 * @author 127
 *
 */

public class LongestSubstringSolution {
	 public int lengthOfLongestSubstring(String s){
	        int size=s.length();
	        String longest="";
	        String temp="";
	        for(int j=0;j<size;j++){
	            temp=s.substring(j,j+1);
	            for(int i=j+1;i<size;i++){
	            int k=temp.indexOf(s.charAt(i));
	            if(k==-1){
	                temp=s.substring(j,i+1);
	            }else{
	                break;
	            }
	            }
	            if(temp.length()>longest.length()){
	            	longest=temp;
	            }
	        }
	        return longest.length();
	    }
}
