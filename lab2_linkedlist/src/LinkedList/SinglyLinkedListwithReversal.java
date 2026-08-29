package LinkedList;

public class SinglyLinkedListwithReversal<T> extends SinglyLinkedListBasic<T> {

    public SinglyLinkedListwithReversal(){
        super();
    }

      //reverse
public void reverse(){
    Node<T> previous=null, current=head, nextNode=null;
  
        if(head.next==null|| head==null){  //empty or single node
            return;
        }
        while(current!=null){
            nextNode=current.next;
            current.next=previous;
            previous=current;
            current=nextNode;
        }
        head=previous;
}




}
