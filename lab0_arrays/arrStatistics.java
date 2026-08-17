/*
1.1  Array Statistics
Objective: To calculate basic statistical values of an array
Taskı 
Given : an array of numerical values
Procedure:
Sum of all elements
Average of the elements
Minimum element
Maximum element
Procedure:
Road the size and elements of the armay.
Traverse the arтау.
Calculate the minimum, and maximum.
Calculate the average using the sum and array size.
5. Display all results.
Complexity: Time: O(n), Space: O(1) (excluding the array).
*/
public class arrStatistics{
    public static void main(String args[]){
int []numbers={0,2,3,2,5,0,0,1,2};
 System.out.println("Size of array: "+ numbers.length);

 int sum=0;
 int min=numbers[numbers.length-1];
 int max=numbers[0];
 System.out.println("The array reads as follows..");
  for(int i=0;i<numbers.length;i++){
    if(numbers[i]>max){
        max=numbers[i];
    }
    if(numbers[i]<min){
        min=numbers[i];
    }
    System.out.print(numbers[i]+" ");
    sum+=numbers[i];
 }
 System.out.println("\nSum of all the elements in array: "+sum);
 System.out.println("Maximum element in array: "+max);
 System.out.println("Minimum element in array: "+min);
 System.out.println("Average of array elements: "+sum/numbers.length);

    }
}