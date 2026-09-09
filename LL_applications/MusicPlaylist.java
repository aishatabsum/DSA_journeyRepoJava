package LL_applications;


class Track{
    String title;
   Track next;
   Track prev;


   public Track(String title){
   this.title=title;
    this.next=prev=null;
   }
}
public class MusicPlaylist {
    private Track head,tail,currentTrack;
    public int size=0;
   

    public MusicPlaylist(){
        this.head=tail=currentTrack=null;
    }
    public void addTrack(String title){
    Track newTrack=new Track(title);
        if(isPlaylistEmpty()){
            head=tail=currentTrack=newTrack;
        }else{
            //from front
            //   newTrack.next=head;
            //   head.prev=newTrack;
            //   head=newTrack;
            //   size++;

            //from back
            tail.next=newTrack;
            newTrack.prev=tail;
            tail=newTrack;
        }
            size++;
System.out.println("Added: "+title);
        
    }
//     public void removeTrack(String title) {
//     if (isPlaylistEmpty()) {
//         System.out.println("No track to remove! playlist is empty");
//         return;
//     }

//     // find the node 
//     Track temp = head;
//     while (temp != null && !temp.title.equals(title)) {
//         temp = temp.next;
//     }
//     if (temp == null) {
//         System.out.println("Not found any such track to remove.");
//         return;
//     }

//     if (temp.prev != null) temp.prev.next = temp.next;
//     else                   head = temp.next;        // removing head

//     if (temp.next != null) temp.next.prev = temp.prev;
//     else                   tail = temp.prev;        // removing tail

//     // if we removed the playing track, move to a neighbor
//     if (currentTrack == temp) {
//         currentTrack = (temp.next != null) ? temp.next : temp.prev;
//     }

//     size--;
//     System.out.println("Removed: " + title);
// }
    public void removeTrack(String title){
if(isPlaylistEmpty()){
    System.out.println("No track to remove! playlist is empty");
    return;
}
 if(head.title.equals(title)){
    if(currentTrack==head){
        currentTrack=head.next;
    }
            head=head.next;
            if(head!=null) head.prev=null;
            size--;
                  System.out.println("Removed: "+title);
           return;
        }
 if(tail.title.equals(title)){
    if(currentTrack==tail){
        currentTrack=tail.prev;
    }
            tail=tail.prev;
             if(tail!=null) tail.next=null;
            size--;
                  System.out.println("Removed: "+title);
           return;
        }
        Track temp=head;
    while(temp!=null){
        if(temp.title.equals(title)){
       if(currentTrack==temp) currentTrack= (temp.next!=null)? temp.next:temp.prev;
    if(temp.next!=null) temp.next.prev=temp.prev; 
    if(temp.prev!=null) temp.prev.next=temp.next; 
        size--;
        System.out.println("Removed: "+title);
         return;
        }
            temp=temp.next;
    }
    System.out.println(" Not found any such track to remove.");
    }

    public void playCurrentTrack(){
   if(isPlaylistEmpty()){
    System.out.println("Playlist is empty!");
    return;
   }else{
    if(currentTrack==null) currentTrack=head;
   System.out.println("Current Track playing: "+currentTrack.title);
   }
    }


    public void playnextTrack(){
        if(isPlaylistEmpty()){
    System.out.println("Playlist is empty! No song to play.");
    return;
   }if(currentTrack==null) {
   currentTrack=head;
    System.out.println("Current Track playing: " + currentTrack.title);
        return;
   }
    if(currentTrack.next==null){
   System.out.println("Reached the end of playlist. No next!");
   }else{
    currentTrack=currentTrack.next;
    System.out.println("Next Track playing:  "+currentTrack.title);
   }
    }

    public void playprevTrack(){
     if(isPlaylistEmpty()){
    System.out.println("Playlist is empty! No track to play.");
    return;
   }if(currentTrack==null) {
     currentTrack=head;
      System.out.println("Current Track playing: " + currentTrack.title);
        return;
   }
       if(currentTrack.prev==null){
   System.out.println("Reached the start of playlist. No previous!");
   }else{
     currentTrack=currentTrack.prev;
    System.out.println("Previous Track playing:  "+ currentTrack.title);
   }
    }

    public void displayPlaylist(){
  if(isPlaylistEmpty()){
        System.out.println("List is empty, No tracks found to display!");
        return;
    }
   System.out.println("------Music-PlayList:-----------");
   if(head.next==null){
    System.out.println("Title: "+head.title);
    return;
   }
   Track temp=head;
   while(temp!=null){
    System.out.println("Title: "+temp.title);
    temp=temp.next;
   }

    }
    public boolean isPlaylistEmpty(){
        return head==null;
    }
}
