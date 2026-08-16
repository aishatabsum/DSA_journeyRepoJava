/*Task Array Analysis System
Objective: To combine multiple array operations into a menu-driven Java application.
Task: Design a memn-driven program containing the following operations:
Display array
Sum and average
Minimum maximum
Search and frequency
Reverse array
Insert element
Delete element
Exit
Procedure:
Initialize the array with input.
Display operation menu.
Accept the user's choice
Perform the selected operation.
Display the result and return to the menu.
Continue until the Exit option is selected.
Complexity: Depends on the selected operation; most array-traversal operations require O(n) time.
*/

import java.util.Scanner;

public class arrAnalysis {

  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    int Logicalsize=sc.nextInt();
int numbers[]=new int[100];
System.out.println("Enter array elements: ");
    for(int i=0; i<Logicalsize; i++){
        numbers[i]=sc.nextInt();
  }  
  int choice=0;
  do{
System.out.println("Array Analysis---Menu");
System.out.println("1. Display array");
System.out.println("2. Display Sum & Avg of array elements");
System.out.println("3. Display Min & Max element");
System.out.println("4. Search element");
System.out.println("5. Reverse array");
System.out.println("6. Insert element in array");
System.out.println("7. Delete element in array");
System.out.println("8. EXIT");

 System.out.print("Enter your choice : ");
    choice=sc.nextInt();
    switch(choice){
        case 1:   
        if(Logicalsize==0){
              System.out.println("Array is empty!");
              break;
            }System.out.println("Display of array elements ");
    for(int i=0; i<Logicalsize;i++){
        System.out.print(numbers[i]+" ");
  }  
  System.out.println();
  break;
 case 2:
            if(Logicalsize==0){
              System.out.println("Array is empty!");
              break;
            }
              int sum=0;
        for(int i=0;i<Logicalsize;i++){
    sum+=numbers[i];
    }
     System.out.println("\nSum of all the elements in array: "+sum);
     System.out.println("Average of array elements: "+(double)sum/numbers.length);
     break;   
                 case 3:
                  if(Logicalsize==0){
              System.out.println("Array is empty!");
              break;
            }  
     int min=numbers[Logicalsize-1];
      int max=numbers[0];
      for(int i=0;i<Logicalsize;i++){
      if(numbers[i]>max){
        max=numbers[i];
    }
       if(numbers[i]<min){
        min=numbers[i];
    }
 }

   System.out.println("Maximum element in array: "+max);
    System.out.println("Minimum element in array: "+min);
break;
    case 4:
      if(Logicalsize==0){
              System.out.println("Array is empty1");
              break;
            }
            System.out.print("\nWrite the  element you want to search?: ");
            int target=sc.nextInt();
         int freq=0;
        System.out.print("Found at index: ");
      for(int i=0; i<Logicalsize; i++){
        if(numbers[i]==target){
          System.out.println(i+" ");
        freq++;
      }

    }
    if(freq==0){
        System.out.println("Target element "+target+" is not found in array \n Freq of targetted element is "+freq);
    }
    else
      System.out.println("Total frequency of target element: "+ freq);
 break;
                        case 5:
          if(Logicalsize==0){
              System.out.println("Array is empty1");
              return;
            }int startInd=0;
        int endInd=Logicalsize-1;
       while(startInd<endInd){
      int temp=numbers[startInd];
      numbers[startInd]=numbers[endInd];
      numbers[endInd]=temp;
        startInd++;endInd--;
       }
       break;
                            case 6:
if(Logicalsize>=numbers.length){
  System.out.println("Array is full! can not insert new element!");
  break;
}
         
        System.out.print("\nWrite the  element you want to insert?: ");
            int newEle=sc.nextInt();
           System.out.print("Write the specified index?(0-"+(Logicalsize)+"): ");
            int specificInd=sc.nextInt();
                if(specificInd>Logicalsize || specificInd<0){
              System.out.println("Invalid (out of array bounds index) is specified\n");
              return;
                   }else
                    { if(specificInd==Logicalsize){
                     numbers[Logicalsize]=newEle;
                   Logicalsize++;
                   }else{
                    
                    for(int i=Logicalsize; i>specificInd; i--){
                        numbers[i]=numbers[i-1];
                    }
                    numbers[specificInd]=newEle;
                    Logicalsize++;
                   }
                }
                break;
     case 7: 
         if(Logicalsize==0){
              System.out.println("Array is empty!");
              break;}

      System.out.print("\nWrite the specified index of element you want to delete (0-"+(Logicalsize-1)+": ");
            int indTodel=sc.nextInt();
                if(indTodel>=Logicalsize || indTodel<0){
              System.out.println("Invalid (out of array bounds index) is specified\n");
              break;
                   }else
                    { if(indTodel==Logicalsize-1){
                     Logicalsize--;
                     System.out.println("Deleted from end!");
                     break;
                   }else{
               
                    for(int i=indTodel; i<Logicalsize-1; i++){
                       numbers[i]=numbers[i+1];  
                    }
                    System.out.println("Deleted succesfully!");
                 Logicalsize--;
                   }
                }
                break;
case 8:  System.out.println("Goodbye>");
    break;
default: System.out.println("Invalid choice.");
break;
    }

}while(choice!=8);

sc.close();
  }
}
