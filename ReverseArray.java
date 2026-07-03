import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        for(int i = arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
        //ye bhi ak method hai array ko reverse karne ka.


        //this is the second method of reverse a array
        int[] arr = {20, 30, 45, 66,90};
        int i =1;
        int j=arr.length-2;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}