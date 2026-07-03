import java.util.Scanner;

public class Arithmetic_operation_on_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of the array : ");
//        int size = sc.nextInt();
//        int [] arr = new int[size];
//        System.out.println("Enter the elements of the array : ");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }for(int i=0;i<arr.length;i++){
//            if(arr[i]<0){
//                System.out.print(arr[i]);
//            }
//        }


        //ques-2 find the sum of the elements in an array.
//        System.out.print("Enter the size of the array : ");
//        int size = sc.nextInt();
//        int [] arr = new int[size];
//        System.out.println("Enter the elements of the array : ");
//        int sum =0, product = 1;
//        for(int i=0;i<size;i++){
//            arr[i] = sc.nextInt();
//            sum=sum+arr[i];
//            product=product*arr[i];
//        }
//            System.out.print(sum+" "+ product);

        //question--3: print the maximum element of the array:

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();                //input
        int [] arr = new int[size];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //inilize the varible after the input
        int max = arr[0];//here never don't initlize from -1 ;
        for(int i = 0; i <arr.length; i++){
            if(arr[i]>max){  //condition
                max=arr[i];
            }
        }
        System.out.print(max+" ");

    }
}
