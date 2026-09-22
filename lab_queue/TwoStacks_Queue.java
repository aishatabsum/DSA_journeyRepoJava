import java.util.Stack;
public class TwoStacks_Queue<T> {
private Stack<T> inStack;
private Stack<T> outStack;
private int size;

public TwoStacks_Queue(){
    inStack=new Stack<>();
     outStack=new Stack<>();
     size=0;
}

//top sy matlb end sy insert karta jaega
public void enqueue(T item){
    inStack.push(item);
    size++;
}

//reversed(out) stack sy matlb front(jo pehly dala gaya) ko delete karpaega
public T dequeue(){
    //sirf tab hi move karengy jab outstack empty ho
if(outStack.isEmpty()){
    while(!inStack.isEmpty()){
        outStack.push(inStack.pop());
    }
}
//agr stackin m bh koi element tha ee nai to outStack empty rahega..queue empty
if(isEmpty()) return null;
size--;
return outStack.pop();
}

public boolean isEmpty(){
return inStack.isEmpty() && outStack.isEmpty();
}
 public int getSize(){
    return size;
 }

 public void printAll(){
    if(isEmpty()){
        throw new RuntimeException("Queue is empty!");
    }
    Stack <T>tempStack=new Stack<>();
    if(!outStack.isEmpty()){
        while(!outStack.isEmpty()){
            System.out.print(outStack.peek()+"   ");
            tempStack.push(outStack.pop());
        }
            while(!tempStack.isEmpty())
            outStack.push(tempStack.pop());
        }
    

       if(!inStack.isEmpty()){
        while(!inStack.isEmpty()){
            tempStack.push(inStack.pop());
        }
        
            while(!tempStack.isEmpty()){
                T ele=tempStack.pop();
                    System.out.print(ele+"   ");
                     inStack.push(ele);
            }
           
        }
    

    
 }
public T peekfromFront(){
    if(outStack.isEmpty()){
    while(!inStack.isEmpty()){
        outStack.push(inStack.pop());
    }
}
//agr stackin m bh koi element tha ee nai to outStack empty rahega..queue empty
if(isEmpty()) return null;
return outStack.peek();
}

}
