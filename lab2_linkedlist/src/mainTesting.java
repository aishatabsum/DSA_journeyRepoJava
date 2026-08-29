import LinkedList.*;

public class mainTesting{
    public static void main(String args[]){
           System.out.println("Exercise 1:");
        SinglyLinkedListEx1<Integer> list1=new SinglyLinkedListEx1<>();
        list1.addToFront(3);
        list1.addToFront(45);
        list1.addToFront(43);
        list1.addToBack(8);
        list1.addToBack(78);
        list1.addToBack(95);
        list1.printall();
        System.out.print("Front: "  + list1.getFrontItem());
        System.out.println();
        System.out.println("Back: "+ list1.getBackItem());
        
     System.out.println("Exercise 3:");
         SinglyLinkedListEx2<Integer> list2=new SinglyLinkedListEx2<>();
      list2.addToBack(38);
        list2.addToBack(7);
        list2.addToBack(9);
     list2.printall();
      System.out.println("Back item:O(1): "+ list2.getBackItem());
   list2.removeBackItem();
   list2.printall();

              System.out.println("Exercise 3:");
          SinglyLinkedListEx3<Integer> list3=new SinglyLinkedListEx3<>();
     list3.addToBack(38);
    list3.addToBack(57);
    list3.addToBack(69);
     list3.addToBack(68);
    list3.addToBack(17);
    list3.addToBack(39);
  list3.printall();
      System.out.println("Get item at index 3: "+ list3.getDataAtindex(3));
list3.insertAtindex(12, 3);
  list3.printall();
list3.removeFromIndex(3);
  list3.printall();



               System.out.println("Exercise 4:");
           SinglyLinkedListEx4<Integer> list4=new SinglyLinkedListEx4<>();
    list4.addToBack(1);
    list4.addToBack(2);
    list4.addToBack(3);
     list4.addToBack(4);
    list4.addToBack(5);
    list4.addToBack(6);
      System.out.println("Before reverse:");
  list4.printall();
  list4.reverse();
    System.out.println("After reverse: ");
  list4.printall();




        System.out.println("IS LIST EMPTY ? "+list1.isListEmpty());
    }
}

