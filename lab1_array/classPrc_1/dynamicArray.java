package lab1_array.classPrc_1;
//generic classes: template classes for undeclared types
import java.util.ArrayList;
//arraylist is dynamic in sense as new ele is inserted , a new arr 
//of size one greater and copies previous elements, same foe delete
public class dynamicArray {
    public static void main(String args[]){
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(78);
        arr.add(6);
        arr.add(67);
        arr.add(44);
        arr.add(8);
        arr.add(677);
        System.out.println(arr.get(3));
        for (int e: arr){
        System.out.print(e+" ");
        }
 System.out.println();
        for(int i=0; i<arr.size();i++){
       System.out.println(arr.get(i));
        }

    }
}
