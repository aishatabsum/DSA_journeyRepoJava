import SinglyLinkedList.*;
import doublyLinkedList.doublyLinkedListWithHead;
import doublyLinkedList.doublyLinkedListwithTail;

public class mainTesting{
    public static void main(String args[]){
      System.out.println("............Singly Linked list exercises.........");
      System.out.println();
           System.out.println("Exercise 1:");
        SinglyLinkedListBasic<Integer> list1=new SinglyLinkedListBasic<>();
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
        System.out.println();
     System.out.println("Exercise 3:");
         SinglyLinkedListWithTail<Integer> list2 =new SinglyLinkedListWithTail<>();
      list2.addToBack(38);
        list2.addToBack(7);
        list2.addToBack(9);
     list2.printall();
      System.out.println("Back item:O(1): "+ list2.getBackItem());
   list2.removeBackItem();
   list2.printall();
System.out.println();
              System.out.println("Exercise 3:");
          SinglyLinkedListIndexedOperation<Integer> list3=new SinglyLinkedListIndexedOperation<>();
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


System.out.println();
               System.out.println("Exercise 4:");
           SinglyLinkedListwithReversal<Integer> list4=new SinglyLinkedListwithReversal<>();
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

           System.out.println("............Doubly Linked list exercises.........");
           System.out.println();
              System.out.println("Exercise 1: (with head node only)");
              System.out.println();
             
               doublyLinkedListWithHead<Integer> d_list1=new doublyLinkedListWithHead<>();
                d_list1.addToFront(3);
        d_list1.addToFront(55);
        d_list1.addToFront(93);
        d_list1.addToBack(80);
        d_list1.addToBack(28);
        d_list1.addToBack(65);
       d_list1.printall();
        System.out.println();
        System.out.print("Front: "  + d_list1.getFrontItem());
        System.out.println();
        System.out.println("Back: "+ d_list1.getBackItem());
         System.out.println();
        d_list1.removeFrontItem();
        d_list1.removeBackItem();
        d_list1.printall();
         System.out.println();
        d_list1.addKeyAfterNode(29, 80);
          d_list1.addKeyBeforeNode(79, 80);
          d_list1.printall();
System.out.println();
  System.out.println("Exercise 2: (with head and tail node)");
   System.out.println();
               doublyLinkedListwithTail<Integer> d_list2=new doublyLinkedListwithTail<>();
       d_list2.addToFront(13);
        d_list2.addToFront(45);
        d_list2.addToFront(53);
        d_list2.addToBack(81);
        d_list2.addToBack(20);
        d_list2.addToBack(60);
       d_list2.printall();
        System.out.println();
        System.out.print("Front: "  + d_list2.getFrontItem());
        System.out.println();
        System.out.println("Back: "+ d_list2.getBackItem());
         System.out.println();
        d_list2.removeFrontItem();
        d_list2.removeBackItem();
        d_list2.printall();
        d_list2.addKeyAfterNode(29, 20);
          d_list2.addKeyBeforeNode(79, 20);
          d_list2.printall();
          System.out.println();
    }
}

