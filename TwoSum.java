public class TwoSum {
//    public static void main(String[] args) {
//        int [] nums = {2, 7, 11, 15,22,5,6};
//        int target = 9;
//
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i+1; j <nums.length; j++){
//                if(nums[i]+nums[j] == target){
//
//                    System.out.println("found");
//                    return;
//                }
//
//            }
//        }
//        System.out.print("not found");
//    }

    //2nd method--hum method ka use karke bhi same question ko solve kar sakthe hai.
public static void takeArray(int[] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==9){
                System.out.println("found"+" " +arr[i]+" " +arr[j]);
                return;
                    }
                }
                System.out.println("not found");
            }

        }

        public static void main(String[] args){
       int[] arr = {7, 3,2,6};
       takeArray(arr);
    }
}
