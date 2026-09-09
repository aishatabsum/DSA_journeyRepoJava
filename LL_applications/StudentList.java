package LL_applications;

class Student{
    String name;
    int rollno;
    Student next;

    Student(String name, int rollno){
        this.rollno=rollno;
        this.name=name;
        this.next=null;
    }
}
public class StudentList {
    private Student head;
    public int size=0;

    public StudentList(){
        this.head=null;
    }

    public boolean isStudentListempty(){
    return head==null;
    }

   public void addStudent(String name, int rollno){
      Student newStudent=new Student(name, rollno);
    if(isStudentListempty()){
        head=newStudent;
         size++;
         return;
    }
  
    //adding from left (before head)
    // newStudent.next=head;
    // head=newStudent;
    // size++;

    //adding from back
    Student current=head;
    while(current.next!=null){
        current=current.next;
    }
    current.next=newStudent;
    size++;
   }

   public int Getsize(){
    return size;
   }
   
   public void displayStudents(){
    if(isStudentListempty()){
        System.out.println("List is empty, No students found to display!");
        return;
    }
   System.out.println("-------StudentList:-----------");
   if(head.next==null){
    System.out.println("Name: "+head.name+"  RollNo: "+head.rollno);
    return;
   }
   Student current=head;
   while(current!=null){
    System.out.println("Name: "+current.name+"  RollNo: "+current.rollno);
    current=current.next;
   }

   }

   public void searchElement(int rollno){
    if(isStudentListempty()){
        System.out.println("List is empty, no element to find!");
        return;
    }
   
    if(head.rollno==rollno){
        System.out.println("Student found!");
        System.out.println("Name: "+head.name+" RollNo: "+head.rollno);
        return;
    }
    if(head.next==null){
         System.out.println("Student Not found!");
         return;
    }
  Student current=head;
  while(current!=null){
    if(current.rollno==rollno){
         System.out.println("Student found!");
        System.out.println("Name: "+current.name+" RollNo: "+current.rollno);
        return;
    }
    current=current.next;
  }
 
    System.out.println("Student NOT found in list!");
   
   }

     public void deleteStudent(int rollno){
      
        if(isStudentListempty()){
            System.out.println("List is Empty. No Student to remove.");
            return;
        }
        if(head.rollno==rollno){
            head=head.next;
            size--;
           return;
        }
         Student current=head;
    while(current!=null){
        if(current.next.rollno==rollno){
        current.next=current.next.next;
        size--;
         return;
        }
            current=current.next;
    }
    System.out.println(" Not found any such Student.");
    }


}
