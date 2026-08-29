package LinkedList;

public class SinglyLinkedListWithTail<T> extends SinglyLinkedListBasic<T> {
    protected Node<T> tail;
    public SinglyLinkedListWithTail(){
       tail=null;
    }

    //add at front
    @Override
    public void addToFront(T data){
        Node<T>newNode= new Node<>(data);
        if(isListEmpty()){
            head=newNode;
            tail=newNode;//the very first node created is head and tail both
        } else{
            newNode.next=head; //let newNode have refernce to previous head
            head=newNode; //shift head to this fronted element
            //only shift head as tail is already at last.
        }
    }
    //insert at back
       public void addToBack(T data){
        Node <T> newNode=new Node<>(data);
        if(isListEmpty()){
            head=newNode;
            tail=newNode;
        }else{
             tail.next=newNode;
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

    //remove backitem
    @Override
    public void removeBackItem(){
    if(isListEmpty()){
            System.out.println("List is Empty. No last element.");
            return ;
        }
        if(head==tail){//size is 1
        head=tail=null;
        }
        //to remove back item we need to set tail's predecessor next to null.
        Node<T>current=head;
        while(current.next!=tail){
            current=current.next;
        }
        tail=current;
        tail.next=null;
    }
}
