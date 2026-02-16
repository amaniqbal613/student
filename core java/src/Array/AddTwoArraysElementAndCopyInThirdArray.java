//	18) 	wap to add two array elements n copy into third array
package Array;

public class AddTwoArraysElementAndCopyInThirdArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};
int arr3[]=new int[arr1.length];
for (int i=0;i< arr1.length;i++){
    arr3[i]=arr1[i] + arr2[i];
}
        System.out.println("Result of third array");
for (int i=0;i<arr3.length;i++){
    System.out.println(arr3[i]);
}
    }
}
