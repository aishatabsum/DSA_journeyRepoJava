package doublyLinkedList;

public class doublyLinkedListwithTail<T> extends doublyLinkedListWithHead<T>{
protected Node<T> tail;
public doublyLinkedListwithTail(){
    super();
    this.tail=null;
}

    //insert at front
    public void addToFront(T data){
        Node<T>newNode= new Node<>(data);
        if(isListEmpty()){
            head=tail=newNode; //the very first node created is head and tail
        } else{
            newNode.next=head; //let newNode have refernce to previous head
            head.prev=newNode; // head pointing back to new head
            head=newNode;      //shift head to this front ele
        }
    }
 
  //remove front/first item
        public void removeFrontItem(){
        if(isListEmpty()){
            System.out.println("List is Empty. No element to remove.");
        }else{
            head=head.next;
            if(head!=null) //if nodes>1
            head.prev=null;
            else tail = null;//if one node only
            //if just one item is there
            //head becomes null and we make tail explicitly null
        }
    }
    //insert at back
       public void addToBack(T data){
        Node <T> newNode=new Node<>(data);
        if(isListEmpty()){
            head=tail=newNode;
        }else{
               tail.next=newNode;
               newNode.prev=tail;
               tail=newNode;
        }
       }
       //get back/last item
        public T getBackItem(){
        if(isListEmpty()){
            System.out.println("List is Empty. No last element.");
            return null;
        }else{
            return tail.data;
        }
    }
    //remove back node
        public void removeBackItem(){
        if(isListEmpty()){
            System.out.println("List is Empty. No element to remove.");
            return;
        }
        if(head==tail){ //size is 1
            head=tail=null;
            return;
        }      
        tail=tail.prev;
        tail.next=null; 
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
        else tail = null;
            //  System.out.println("Removed successfully!.");
           return;
        }
          Node<T> current=head;
    while(current!=null){
        if(current.data.equals(key)){
        current.prev.next=current.next;
        if(current.next!=null)
       current.next.prev=current.prev;
       else tail = current.prev; //if current is last node(current.next=null)
        // System.out.println("Removed successfully!.");
         return;
        }
            current=current.next;
    }
    System.out.println("Invalid Key . Not found any such key.");
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
current.prev.next=newNode;
current.prev=newNode;

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
         if(current == tail) tail = newNode;
    //    System.out.println("added successfully");
        return ;
        }
        current=current.next;
        }
        System.out.println("Could not find target key!");
    }


}