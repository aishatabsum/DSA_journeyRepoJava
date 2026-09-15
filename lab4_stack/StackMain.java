import src.*;
public class StackMain {
   
    public static void main(String args[]){
     System.out.println("Stack with array-------");
 ArrayStack stk1=new ArrayStack(10);
stk1.push(12);
stk1.push(4);
stk1.push(2);
stk1.push(1);
stk1.display();
System.out.println();
System.out.println("Size: " +stk1.size());
System.out.println("Peeked : "+stk1.peek());
System.out.println("Popped: "+stk1.pop());
System.out.println("Size: "+stk1.size());
stk1.display();
System.out.println();
System.out.println("Peeked : "+stk1.peek());

 System.out.println("Stack with Linkedlist-------");
        LinkedListStack llstk=new LinkedListStack();
        llstk.push(55);
             llstk.push(45);
                  llstk.push(35);
                   llstk.push(25);
                       llstk.push(15);
                            llstk.push(65);
                             llstk.display();
                               System.out.println();
                            System.out.println("Size: "+ llstk.size());
                             System.out.println("Peeked: "+ llstk.peek());
                              System.out.println("Popped: "+ llstk.pop());
                               System.out.println("Size: "+ llstk.size());
                              llstk.display();
                              System.out.println();
palindromeChecker pc= new palindromeChecker();
String e="madam";
 System.out.println(e+ " ispalindrome: "+ pc.isPalindrome(e));
 parenthesisBalanced pb=new parenthesisBalanced();
  System.out.println("{[(a+b)}  isBalanced: "+pb.isBalanced("{[(a+b)}"));
    }
}
