//	15) 	wap to find smallest number among array element
package Array;

public class SmallestArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,5,3,6,7,};
int smallest=7;
for (int i=0;i< arr.length;i++){
    if (arr[i]<smallest){
        smallest=arr[i];
        }
    }
        System.out.println("smallest array="+smallest);
}
    }

