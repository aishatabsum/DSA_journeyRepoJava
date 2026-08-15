/*1.3 Exercise 3: Reverse Array
Objective: To reverse an array without using another array.
Task: Reverse the elements of In-place.
Procedure
1.Set one position at the beginning and another at the end.
2. Swap the elements at these positions.
3.Move both positions toward the conter.
4.Continue until the positions meet.
Complexity: Time: O(n), Space: 0(1).*/

public class arrReverse {
    public static void main(String args[]){
        int [] numbers={0,2,3,2,5,0,0,1,2};
        System.out.println("Displaying array before reversing: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        int startInd=0;
        int endInd=numbers.length-1;
       while(startInd<endInd){
      int temp=numbers[startInd];
      numbers[startInd]=numbers[endInd];
      numbers[endInd]=temp;
        startInd++;endInd--;
       }
 System.out.println("\nDisplaying array after reversing: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
