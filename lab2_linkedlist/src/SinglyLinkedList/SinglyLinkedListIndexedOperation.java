package SinglyLinkedList;

public class SinglyLinkedListIndexedOperation <T> extends SinglyLinkedListBasic<T> {
    public SinglyLinkedListIndexedOperation(){
        super();
   }
   
 //size
    public int size(){
        int count=0;
        Node <T>current=head;
      while(current!=null){
        count++;
      current=current.next;
        }
        return count;
    }

//get(int index)
public T getDataAtindex(int index){
      if(isListEmpty()){
            System.out.println("List is Empty. No element to display.");
            return null;
        }
     if(index>=size()|| index<0){
            System.out.println("Invalid index out of bounds.");
            return null;
        }
    Node<T>current=head;
    for(int i=0; i<index; i++){//current is stoing key one ahead than i
current=current.next;
    }
    return current.data;
}


//insertAt(int index)
public void insertAtindex(T key, int index){
     if(isListEmpty()){
            System.out.println("List is Empty. No index to insert at.");
            return ;
        }
     if(index>size()|| index<0){
            System.out.println("Invalid index out of bounds.");
            return ;
        }
        if(index==size()){
            addToBack(key);
            return;
        }
    Node<T>current=head;
    for(int i=0; i<index-1;i++){
        current=current.next;
    }
    Node<T>newNode=new Node<>(key);
    newNode.next=current.next;
    current.next=newNode;
}


//removeFromindex(int index)
public void removeFromIndex(int index){
 if(isListEmpty()){
            System.out.println("List is Empty. No index to remove from.");
            return ;
        }
     if(index>=size()|| index<0){
            System.out.println("Invalid index out of bounds.");
            return ;
        }
        if(index==0){
            removeFrontItem();
            return;
        }
        if(index==size()-1){
            removeBackItem();
            return;
        }
         Node<T>current=head;
        for(int i=0; i<index-1; i++){
            current=current.next;
        }
        current.next=current.next.next;
}

}
