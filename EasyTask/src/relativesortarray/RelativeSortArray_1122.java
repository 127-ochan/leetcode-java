package relativesortarray;
/**
 * 计数排序
 * @author 127
 *
 */
public class RelativeSortArray_1122 {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int size1=arr1.length;
        int size2=arr2.length;
        int[] arr=new int[size1];
        int[] count=new int[1001];
        for(int e:arr1){
            count[e]++;
        }
        int i=0;
        for(int e:arr2){
            while(count[e]>0){
                arr[i++]=e;
                count[e]--;
            }
        }
        for(int j=0;j<1001;j++){
            while(count[j]>0){
                arr[i++]=j;
                count[j]--;
            }
        }
        return arr;
    }
}
