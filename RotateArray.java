public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int d = 4;

        // print from d to end
        for(int i = d; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // print first d elements
        for(int i = 0; i < d; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

            //use function
//jpublic class RotateArray {
//     static void rotateArr(int arr, int d ) {
//
//        int n = arr.length;
//        d = d % n;
//        reverse(arr, 0 ,d-1);
//        reverse(arr, d, n-1);
//        reverse(arr, 0, n-1);
//    }
//    static void reverse(int [] arr, int i , int j )
//    {
//         while (i < j)
//         {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//    }
//    public static void main(String[] args) {
//         int [] arr ={1,2,3,4,5,6,7,8,9,10};
//         int d = 3;
//         rotateArr(arr , d);
//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//    }
//}