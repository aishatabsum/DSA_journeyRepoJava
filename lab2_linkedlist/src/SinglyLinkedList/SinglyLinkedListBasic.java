package SinglyLinkedList;

//used where quick shuffling inserting deleting required
//quick access k lye use array
public class SinglyLinkedListBasic<T>{
    //protected so that child
    //in any package in new files may access it.
    protected static class Node<T>{
    protected T data;
    protected Node<T> next;

    public Node(T data){
    this.data=data;
    this.next=null;
     }
    }

    protected Node<T> head;

    public SinglyLinkedListBasic(){
        this.head=null;
    }
    //check list is empty or not
    public boolean isListEmpty(){
        return (head==null);
    }
    //insert at front
    public void addToFront(T data){
        Node<T>newNode= new Node<>(data);
        if(isListEmpty()){
            head=newNode;//the very first node created is head
        } else{
            newNode.next=head; //let newNode have refernce to previous head
            head=newNode; //shift head to this fronted ele
        }
    }
    //get front item
    public T getFrontItem(){
        if(isListEmpty()){
            System.out.println("List is Empty. No first element.");
            return null;
        }else{
            return head.data;
        }
    }
  //remove front/first item
        public void removeFrontItem(){
        if(isListEmpty()){
            System.out.println("List is Empty. No element to remove.");
        }else{
            head=head.next;
            //if just one item is there
            //head becomes null
        }
    }
    //insert at back
       public void addToBack(T data){
        Node <T> newNode=new Node<>(data);
        if(isListEmpty()){
            head=newNode;
        }else{
              Node<T> current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
       }
       //get back/last item
        public T getBackItem(){
        if(isListEmpty()){
            System.out.println("List is Empty. No last element.");
            return null;
        }else{
             Node<T> current=head;
              while(current.next!=null){
                current=current.next;
            }
            return current.data;
        }
    }
    //remove back node
        public void removeBackItem(){
        if(isListEmpty()){
            System.out.println("List is Empty. No element to remove.");
            return;
        }
        if(head.next==null){ //size is 1
            head=null;
            return;
        }        Node<T> current=head;
               while((current.next).next!=null){
                current=current.next;
            }
            current.next=null;  
    }
    //find
    public boolean find(T key){
          if(isListEmpty()){
            System.out.println("List is Empty. No element to find.");
            return false;
        }
    Node<T> current=head;
while(current!=null){
    if(current.data.equals(key))
       return true;
    current=current.next;
   }
    return false;
    }

  //remove given key/item
     public void remove(T key){
      
        if(isListEmpty()){
            System.out.println("List is Empty. No element to remove.");
            return;
        }
        if(head.data.equals(key)){
            head=head.next;
           return;
        }
          Node<T> current=head;
    while(current!=null){
        if(current.next.data.equals(key)){
        current.next=current.next.next;
         return;
        }
            current=current.next;
    }
    System.out.println("Invalid Key . Not found any such key.");
    }

    
   //display
    public void printall(){
         Node<T> current=head;
        if(isListEmpty()){
            System.out.println("List is Empty. No element to display.");
            return;
        }
        while(current!=null){
      System.out.print(current.data+" ");
      current=current.next;
        }
    }


    public void addKeyBeforeNode(T newkey, T targetKey){
            if(isListEmpty()){
            System.out.println("List is Empty. No target key found..");
            return;
        }
      if(head.data.equals(targetKey)){
Node <T> newNode= new Node<>(newkey); 
newNode.next=head;
head=newNode;
return;
      }
    Node<T> current=head; 
        while(current.next!=null){
        if(current.next.data.equals(targetKey)){
Node <T> newNode= new Node<>(newkey); 
newNode.next=current.next;
current.next=newNode;
return ;
        }
        current=current.next;
        }

    }


    public void addKeyAfterNode(T newkey,T targetKey){
       if(isListEmpty()){
            System.out.println("List is Empty. No target key found..");
            return;
        }
          Node<T> current=head; 
        while(current!=null){
        if(current.data.equals(targetKey)){
         Node <T> newNode= new Node<>(newkey); 
        newNode.next=current.next;
       current.next=newNode;
        return ;
        }
        current=current.next;
        }
    }

}
