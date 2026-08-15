/*Task 1: Array Insertion
Objective: To understand insertion of an element at different positions in an array.
Task: Design a Java program to insert an clement at
1. Heginning
2. Middle/specified position
3. End
Procodure:
Check whether sufficient array capacity is available.
Select the required insertion position
Shift existing elements when necessaгу
Place element at the selected position.
insert when capacity is available.
Update the logical size of the array.
 Complexity: Beginting/Middle: O(n); End: O(1)
*/
import java.util.Scanner;

public class arrInsert {
   public static void main(String args[]){
     int [] numbers={0,2,3,2,5,0,0,1,2};
     int []newNumbers=new int[numbers.length+1];
     for(int i=0; i<numbers.length; i++){
      newNumbers[i]=numbers[i];
     }
        System.out.println("Displaying array : ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
          Scanner sc= new Scanner(System.in);
        System.out.print("\nWrite the  element you want to insert?: ");
            int newEle=sc.nextInt();
           System.out.print("Write the specified index?: ");
            int specificInd=sc.nextInt();
                if(specificInd>=numbers.length || specificInd<0){
              System.out.println("Invalid (out of array bounds index) is specified\n");
                   }else
                    { if(specificInd==numbers.length-1){
                     newNumbers[numbers.length]=newEle;
                   }else{
                    
                    for(int i=newNumbers.length-1; i>specificInd; i--){
                        newNumbers[i]=newNumbers[i-1];
                    }
                    newNumbers[specificInd]=newEle;
                   }
  numbers=newNumbers;
   System.out.println("Displaying array after insertion: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

      }
      sc.close();
   } 
}
