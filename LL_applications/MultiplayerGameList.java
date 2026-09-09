package LL_applications;

class player{
String name;
player next;

public player(String name){
    this.name=name;
    this.next=null;
}
}

public class MultiplayerGameList{
    private player head,currentPlayer;
    public int size=0;

    public MultiplayerGameList(){
        this.head=currentPlayer=null;

    }

    public void addPlayer(String name){
   player newPlayer=new player(name);
   if(isGamelistEmpty()){
    head=currentPlayer=newPlayer;
     head.next=head; //single node points to itself cirular
    size++;
    return;
   }else{
    player temp=head;
   while(temp.next!=head){
        temp=temp.next;
    } 
    temp.next=newPlayer;
    newPlayer.next=head;
    size++;
   }
   System.out.println("--"+name+" joined the game!");
    }

     public void removePlayer(String name){
  if(isGamelistEmpty()){
    System.out.println("Gamelist is empty . can't remove any player!");
    return;
  }
  if(head.next==head && head.name.equals(name)){ //single and to-be removed node
        head=currentPlayer=null;
        size--;
        System.out.println(name+" left the game!");
        return;
    }

    player temp=head;
   do{
 if(temp.next.name.equals(name)){
        if(temp==currentPlayer){
        currentPlayer=temp.next;
    }
   temp.next=temp.next.next;
     if(temp==head){head=temp.next;}
     size--;
     System.out.println(name+" left the game.");
   return;
 }
        temp=temp.next;
    } while(temp.next!=head);
    System.out.println("Player not found!");
  }
    
     public void nextTurn(){
        if(isGamelistEmpty()){
            System.out.println("List is empty!. No next player...");
            return;
        }
    currentPlayer=currentPlayer.next;
System.out.println("Now, turn: "+currentPlayer.name);

    }
    
     public void displayPlayers(){
 if(isGamelistEmpty()){
            System.out.println("List is empty!....");
            return;
        }
        player temp=head;
       do{
            System.out.println("Player_Name: "+ temp.name);
            temp=temp.next;
        }while(temp!=head);
    }


    public boolean isGamelistEmpty(){
        return head==null;
    }
    public int getSize(){
        return size;
    }
}