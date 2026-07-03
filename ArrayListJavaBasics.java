import java.util.ArrayList;
public class ArrayListJavaBasics {
    public static void main(String[ ]args){
        //is array list ka kam hai array ke under fix element wali problem ko solve karna
        //is list ke andar elements one by one add hote jate hai ak piche ak
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

//        System.out.println(arr.get(3)); //yaha pe hum arr(0) nahi likh sakthe access karne ke liya yaha get ka use karna hi padega
//
//        //we want change the value of 3 element
//        arr.set(3,740);
//        System.out.println(arr.get(3));
        System.out.println(arr);//hum iske andar traversing vagra kuch bhi nahi kar sakthe
        //ye hame pura array list me print karke dega or agar hum ye same chig array me karthe to vo hame error deta

        int n =  arr.size();//vaha hamere pas length hoti thi ab hamre pas size hai

        for(int i =0; i<n; i++){
            System.out.print(arr.get(i)+" ");
            //ye loop hame array type me print karek dega
        }

        //yaha hum for each loop bhi use kar sakthe hai
        for (int element : arr) {
            System.out.print(element+" ");
        }

        //yadi mujhe kuch insert karna hai kisi bhi place pe to mai kar saktha hu but karne ka tarika alag hoga

        arr.add(999);//ye to piche jake add ho jayega

        arr.add(2,95);//gus gaya bich me
        System.out.println(arr+" ");
        arr.remove(2);  //kisi bhi element ko remove bhi kar sakthe hai
        arr.remove(arr.size()-1);//last element to remove karega ye
        System.out.println(arr+" ");

        //yaha reverse karne ka tarika thoda alag hota hai
        int i =0 , j = arr.size()-1;
        while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));//yaha pe hum array ki tarah i=j nahi kar sakthe hame value set karni padegi
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}

// yaha hum kisi bhi data type ki arraylist bana sakthe hai
