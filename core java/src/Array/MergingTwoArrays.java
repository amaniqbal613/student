//	17) 	wap to copy two arrays into one array
package Array;

import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        int[] merged=new int[arr1.length+ arr2.length];
        System.arraycopy(arr1,0,merged,0,arr1.length);
        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);
        System.out.println("Merged Array="+ Arrays.toString(merged));
    }
}
