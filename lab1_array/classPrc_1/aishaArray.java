package lab1_array.classPrc_1;

public class aishaArray {
    private int[]array;
    private int size;


    public aishaArray(int capacity){
        array=new int[capacity];
        size=0;
    }

    public int get(int index){
      if(index<0||index>=size){
     return array[index];
      }else
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public void add(int value){
   if(size<array.length){
    array[size]=value;
    size++;
   }else 
    System.out.println("Array is full to its capacity. Can not add!");
    }

   public void display(){
    for(int i=0; i<size;i++){
        System.out.print(array[i]+" ");
    }
    System.out.println();
   }

    public int getSize(){
         return size;

    }
}
