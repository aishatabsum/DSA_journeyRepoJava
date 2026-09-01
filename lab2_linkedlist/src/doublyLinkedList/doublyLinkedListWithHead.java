package doublyLinkedList;

public class doublyLinkedListWithHead<T> {
    //operations requiring frequent track of next and prev.

    protected static class Node<T>{
      protected T data;
      protected Node<T>next;
      protected Node<T>prev;


    public Node(T data){
    this.data=data;
    prev=next=null;
    }

    }
    protected Node<T>head;

    public doublyLinkedListWithHead(){
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
            head.prev=newNode;// head pointing back to new head
            head=newNode; //shift head to this front ele
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
            if(head!=null)
            head.prev=null;
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
            while(current.next!=null){ //current becomes last node
                current=current.next;
            }
            newNode.prev=current;
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
        }      
          Node<T> current=head;
         while(current.next!=null){
                current=current.next;
            }
            (current.prev).next=null;  
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
            if(head!=null)
            head.prev=null;
            //  System.out.println("Removed successfully!.");
           return;
        }
          Node<T> current=head;
    while(current!=null){
        if(current.data.equals(key)){
        if(current.prev!=null)
        current.prev.next=current.next;
        if(current.next!=null)
       current.next.prev=current.prev;
        // System.out.println("Removed successfully!.");
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
head.prev=newNode;
head=newNode;
// System.out.println("added successfully!");
return;
      }
    Node<T> current=head; 
        while(current!=null){ 
        if(current.data.equals(targetKey)){
Node <T> newNode= new Node<>(newkey); 
newNode.next=current;
newNode.prev=current.prev;
current.prev=newNode;
current.prev.next=newNode;
// System.out.println("added successfully!");
return ;
        }
        current=current.next;
        }
System.out.println("Could not found target key!");
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
       newNode.prev=current;
       if(current.next!=null)
       current.next.prev=newNode;
         current.next=newNode;
    //    System.out.println("added successfully");
        return ;
        }
        current=current.next;
        }
        System.out.println("Could not find target key!");
    }


}
