/*Exercise 2: Search and Frequency
Objective: To search for a target element and determine its position and frequency,
Task: Given an array and a target value
Determine whether the target exists.
Find its position(s)
Count its total frequency.
Procedure:
Read the array elements and target value.
Traverse the array sequentially.
Compare each element with the target.
4. Record matching positions and increment the frequеnсу.
5. Display the search result.
Complexity: Time: O(n), Space: 0(1).*/
public class arrSearchFreq {
    public static void main(String args[]){
       int [] numbers={0,2,3,2,5,0,0,1,2};
      int target=2; int freq=0;
       for(int i=0; i<numbers.length; i++){
         System.out.print(numbers[i]+" ");
       }
      System.out.println("Target element is: "+target);
      for(int i=0; i<numbers.length; i++){
         int index=-1;
        if(numbers[i]==target){
       index=i;
        freq++;
      }
      if(index!=-1){
        System.out.println("Found at index: "+index);
      }
    }
    if(freq==0){
        System.out.println("Target element "+target+" is not found in array \n Freq of targetted element is "+freq);
    }
    else
      System.out.println("Total frequency of target element: "+ freq);
 
    }
}
