import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("enter element of the array: ");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("target:");
        int target = sc.nextInt();
        boolean flag = false;   //ham ye man ke chal rahe hai ki hamara element us array ke andar nahi hai.
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("element hai");
        else System.out.println("element nahi hai");

    }
}

            //second method of searching:

//hum is uper wale question ke andar agar hame index ki value bhi nikalni ho to hum ak variable se bhi kar sakthe hai.
//int[] arr = {20, 30, 45, 69};
//int target  = 69;
//int found = -1;     //it means ki element hai hi nahi aarray me
//        for (int i = 1; i < arr.length; i++) {
//        if (arr[i] == target){
//found = i;
//            break;
//                    }
//                    }
//                    if(found != -1) System.out.println("array ke andar element hai indexed number:"+found);
//        else System.out.println("array ke nahi hai");



