import java.util.Arrays;

import static java.util.Arrays.*;

public class TwoDimensionalArray {
    public static void main(String[] args) {
//        int[][] matrix = new int[3][4];             //declaration of 2d array     [rows=0] [column=0]
//        int[][] mat = { { 1,2,3},
//                        {4,5,6},
//                        {7,8,9}
//                      };                             //initialization
//        System.out.println(mat[1][2]);//accessing the element mat[rows][column] = 6
       // System.out.println(mat.length);
        //System.out.println(mat[0].length);

        //traversing of the 2d array
//        for(int r=0; r<mat.length; r++){
//            for(int c=0; c<mat[r].length; c++){
//                System.out.print(mat[r][c]+" ");
//            }
//        }
//        System.out.println();


        int[] arr = {6,89,65,23,10,45,65,78,32,10,24,29,28,4587,65987,236,4125,1023,7894 };
        int max = arr[0];
        for(int val : arr) {
            if(val > max) {
                max = val;
            }
        }System.out.print(max+" ");
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
