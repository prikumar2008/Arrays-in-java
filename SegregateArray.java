public class SegregateArray {
    public static void main(String[] args) {
          int[] arr = {0,1,1,1,0,0};
          int n = arr.length;
//          int j = 0;
//          for ( int i = 0; i < n; i++) {
//              if (arr[i] == 0){         //only one difference if we do != then all zeros are at right position if == then all zero at left position,
//                  int temp = arr[i];
//                  arr[i] = arr[j];
//                  arr[j] = temp;
//                  j++;
//              }
//
//          }
//          for (int i = 0; i < n; i++) {
//              System.out.print(arr[i]+" ");
//          }

        //solve it with the help of while loop and that is very easy yaha aapko ak hi while loop lagana padega
        int i= 0, j=n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if (arr[j]==1)j--;
            else if(arr[i]==1 && arr[j]==0){
             arr[i] = 0;
            arr[j] = 1;
            i++;
            j--;
            }
        }
        for (int ele : arr){
        System.out.print(ele+" ");
        }
    }
}
