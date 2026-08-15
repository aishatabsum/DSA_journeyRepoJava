/*2.2 Task 2 Array Deletion
Objective: To understand deletion of an element from different positions in array
Task: Design a Java program to delete an element from:
1. Beginning
2. Middle/specified position
3. End
Procedure:
1.Check that the array is not empty
2.Select required deletion position.
3.Shift subsequent elements toward the beginning when required.
4. Decrease the logical size of the array.
5. Display the updated stay
Complexity: Beginning/Middle: O(n); End: 0(1)*/
import java.util.Scanner;

public class arrDelete {
    public static void main(String args[]){
   int [] numbers={0,2,3,2,5,0,0,1,2};
        System.out.println("Displaying array : ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

          Scanner sc= new Scanner(System.in);
           System.out.print("\nWrite the specified index of element you want to delete: ");
            int specificInd=sc.nextInt();
                if(specificInd>=numbers.length || specificInd<0){
              System.out.println("Invalid (out of array bounds index) is specified\n");
                   }else
                    { if(specificInd==numbers.length-1){
                  int newNumbers[]=new int[numbers.length-1];
                  for(int i=0; i<newNumbers.length; i++){
                    newNumbers[i]=numbers[i];
                  }
                  numbers=newNumbers;
                   }else{
                int newNumbers[]=new int[numbers.length-1];
                for(int i=0; i<specificInd;i++){
                    newNumbers[i]=numbers[i];
                }
                    for(int i=specificInd; i<newNumbers.length; i++){
                       newNumbers[i]=numbers[i+1];  
                    }
                   numbers=newNumbers; 
                   }
   System.out.println("Displaying array after deletion: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

      }
      sc.close();
    }
}
