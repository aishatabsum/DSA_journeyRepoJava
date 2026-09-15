package src;
public class ArrayStack{
private int Stack[];
private int top;

//top works like index.
public ArrayStack(int capacity){
    this.top=-1;
    this.Stack=new int[capacity];
}

public void push(int newEle){
if(top==Stack.length-1){
    System.out.println("Stack overflow!");
    return;
}
   Stack[++top]=newEle;
}

public int pop(){
 if(isEmpty()){
        System.out.println("Stack Underflow!");
        return -1;
    }
    return Stack[top--];
}

public int peek(){
    if(isEmpty()){
        System.out.println("Stack Underflow!");
        return -1;
    }
return Stack[top];
}

public int size(){
    return top+1;
}

public void display(){
    for(int i=0; i<=top;i++){
    System.out.print(Stack[i]+" ");
}
}
public boolean isEmpty(){
return top==-1;
}


}