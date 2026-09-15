package src;

public class palindromeChecker {
 
     public boolean isPalindrome(String stk){
      
   ArrayStack tempStk=new ArrayStack(stk.length());
   for(int i=0; i<stk.length(); i++){
    tempStk.push(stk.charAt(i));
   }
   for(int i=0; i<stk.length(); i++){
    char c=(char)tempStk.pop();
    if(stk.charAt(i)!=c) return false;
   }
        return true;
   }

}
