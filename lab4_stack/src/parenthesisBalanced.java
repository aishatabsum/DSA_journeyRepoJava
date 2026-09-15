package src;

public class parenthesisBalanced {
 public boolean isBalanced (String input){
    ArrayStack stack=new ArrayStack(input.length());

    for(int i=0; i<input.length(); i++){
    if(input.charAt(i)=='{'||input.charAt(i)=='['||input.charAt(i)=='(')
    stack.push(input.charAt(i));
    
   else if(input.charAt(i)=='}'||input.charAt(i)==']'||input.charAt(i)==')')
    if(stack.isEmpty()) return false;
    else if(input.charAt(i)==')' && stack.peek() =='(') stack.pop();
       else if(input.charAt(i)=='}' && stack.peek() =='{') stack.pop();
        else if(input.charAt(i)==']' && stack.peek() =='[') stack.pop();
   }
   if(stack.isEmpty()){return true;}
   else return false;
}   
}
