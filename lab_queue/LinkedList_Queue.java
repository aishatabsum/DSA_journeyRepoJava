class Node<T>{
T data;
Node<T> next;

public Node(T data){
this.data=data;
this.next=null;
}

}

   public class LinkedList_Queue<T> {
   private Node<T> front, rear;
   private int size;

    public LinkedList_Queue(){
        this.front=rear=null;
        this.size=0;
    }

//add to back
    public void enqueue(T data){
   Node <T> newNode= new Node<>(data);
   if(rear==null) {front=rear=newNode;
    size++; }
   else{ rear.next=newNode;
    rear=newNode;
    size++;
    }
}

public T peek(){
     if(isEmpty()){
    throw new RuntimeException("Queue is empty");
   }
    return front.data;
}

//remove from front
    public T dequeue(){
    if(isEmpty()){
    throw new RuntimeException("Queue is empty");
   }
    T temp=front.data;
    front=front.next; 
    size--;
    return temp;
    }

    public int getSize(){
    return size;
    }


    public void printAll(){
        if(isEmpty()){
    throw new RuntimeException("Queue is empty");
     }
     Node <T> temp=front;
     while(temp!=null){
        System.out.print(temp.data+"  ");
        temp=temp.next;
     }
     }


    public boolean isEmpty(){
     return front==null;
    }

}
