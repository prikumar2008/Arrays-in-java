import java.util.ArrayList;
import java.util.Collections;
class AddingToOne {
    // Function for adding one to the number represented by the array
    ArrayList<Integer> addOne( int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int carry = 1 ;
        for (int i = n-1; i>=0; i--){
            if(arr[i]+carry<= 9 ){
                ans.add(arr[i]+carry);
                carry = 0;
            }
            else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
//for more information go to Addingtoone gfg