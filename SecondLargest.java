public class SecondLargest {
    public static void main(String[] args) {
//        int [] arr = {4, 6, 9, 8, 7 ,6};
//        int max = arr[0];
//        int secondmax = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > secondmax && arr[i]!=max) {
//                secondmax = arr[i];
//            }
//        }System.out.println(secondmax+" ");

        int [] arr = {4, 6, 9, 8, 7 ,6};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }
}
