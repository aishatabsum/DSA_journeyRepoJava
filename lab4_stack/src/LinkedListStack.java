package src;
public class LinkedListStack {
    
    protected class Node{
        int data;
        Node next;


        protected Node(int data){
            this.data=data;
        }

    }
    protected Node Top;
    private int size;

    public LinkedListStack(){
        this.Top=null;
        this.size=0;
    }

    public void push(int newEle){
   Node newNode= new Node(newEle);
   if(isEmpty()){
    Top=newNode; size++;}
else{ newNode.next=Top;
       Top=newNode;
       size++;
     }
    }

    public int pop(){
    if(isEmpty()){
        System.out.println("Stack underFlow!");
        return -1;
    }
    int temp=Top.data;
     Top=Top.next;
     size--;
     return temp;
    }

    public int peek(){
    if(isEmpty()){
        System.out.println("Stack underFlow!");
        return -1;
    }
    return Top.data;
    }

    public boolean isEmpty(){
    return Top==null;
    }

   public int size(){
    return size;
   }

   public void display(){
    if(isEmpty()){
        System.out.println("Stack underFlow!");
        return ;
    }
    Node temp=Top;
    while(temp!=null){
        System.out.print(temp.data+ " "); 
        temp=temp.next;
    }
   }
}
