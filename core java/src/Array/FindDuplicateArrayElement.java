//	19)	wap to find duplicate elements in an array?
package Array;

public class FindDuplicateArrayElement {
    public static void main(String[] args) {
        int arr1[]={10,20,30,20,10,40,50,40};
        System.out.println("Duplicate Element");
        for (int i=0;i< arr1.length;i++){
            for (int j=i+1;j< arr1.length;j++){
                if (arr1[i]==arr1[j]){
                    System.out.println(arr1[j]);
                }
            }
        }

    }
}
