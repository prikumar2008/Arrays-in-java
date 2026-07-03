public class MergeToSortedArray {
    public static void merge(int[] c,int[] a,int[] b){//c is result array and a and b are input and sorted array.
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){  //this loop checks both conditions of a and b
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;                //k to hamesa badega chaye element a se aaye ya b se.
        }
        //at some point of time a ya b me se ak na ak to finished hoga then jo finished nahi hoga uske ele bahar rah jayenge
        while(i<a.length){      //yadi b finishes then copied element of a
            c[k]=a[i];          //yaha pe itna bada na likh ke hum ye bhi likh sakthe hai c[k++] = a[i++]
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];          //yaha pe itna bada na likh ke hum ye bhi likh sakthe hai c[k++] = b[j++]
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] a  = { 3,5};
        int[] b  = { 1,2,3};
        int[] c = new int[a.length+b.length];
        for(int ele : c){
            System.out.print(ele+" ");  //this for loop does fill the c array with default values 0000000000.
        }
        System.out.println();
        merge(c,a,b);                   //merge calling
        for(int ele : c){               //this loop run after merge() function calling it simply does write final result
            System.out.print(ele+" ");
        }
        System.out.println();
        if(c.length/2==0){
            int p = c.length/2;
            int q = (c.length+1)/2;
            System.out.println((c[p]+c[q])%2);
        }else{
            System.out.println(c[p]/2);
        }
    }
}

