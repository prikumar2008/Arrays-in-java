import java.util.Arrays;

            //pass by vaue wala concept.
public class PassByReference {

//    public static void change(int x){
//    x = 20;
//    System.out.println(x);
//    }
//
//    public static void main(String[] args) {
//        int x =10;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);
//    }


                //pass by reference
    public static void change(int[] y){
        y[0] = 10;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
}