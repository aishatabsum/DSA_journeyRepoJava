public class CircularQueue_arr<T>{
 private T[] QueueArr;
 private int size; 
 private int front; 
 private int rear;
private int capacity;

public CircularQueue_arr(int capacity){
    this.capacity=capacity;
this.QueueArr =(T[]) new Object[capacity];
this.size=0; 
this.front=0;
this.rear=-1;
}

//addition from rear
public void enqueue(T x){
if(isFull()){
    throw new RuntimeException("Queue is full.");
}
rear=(rear+1) % capacity;//like safe circular increment
QueueArr[rear]=x;
size++;
}

//deletion from front
public T dequeue(){
if(isEmpty()){
    throw new RuntimeException("Queue is empty.");
}
T temp=QueueArr[front];
front=(front+1) % capacity;//like safe circular increment
size--;
return temp;

}

public boolean isEmpty(){
return size==0;
}

public T peek(){
if(isEmpty()){
    throw new RuntimeException("Queue is empty.");
}
return QueueArr[front];
}

public boolean isFull(){
return size==capacity;
}

public void printAll(){
if(isEmpty()){
    throw new RuntimeException("Queue is empty.");
}
for(int i=0; i<size; i++ ){
    int index=(front+i)%capacity;
System.out.print(QueueArr[index]+"   ");

}
}

public int getSize(){
    return size;
}

}