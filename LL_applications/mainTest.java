package LL_applications;
public class mainTest{
    public static void main(String args[]){
StudentList students_list1=new StudentList();
students_list1.addStudent("Maryam Bhatti", 32);
students_list1.addStudent("Khadeeja-tul-Kubra", 34);
students_list1.addStudent("Aisha Tabsum", 37);
students_list1.addStudent("Iqra Aslam", 38);
students_list1.addStudent("Saniya Dhalet", 39);

students_list1.displayStudents();
System.out.println("Searching student ....");
students_list1.searchElement(34);
students_list1.deleteStudent(37);
System.out.println("After deleting student ....");
students_list1.displayStudents();


System.out.println();
MusicPlaylist playlist1=new MusicPlaylist();
playlist1.addTrack("Sukoon paya hai  (vocals only)....");
playlist1.addTrack("life and love (vocals only)....");
playlist1.addTrack("Kun Anta  (vocals only)....");
playlist1.addTrack("Tears of Life  (vocals only)....");

playlist1.displayPlaylist();
playlist1.playCurrentTrack();
playlist1.playnextTrack();
playlist1.playprevTrack();
playlist1.removeTrack("life and love (vocals only)....");
playlist1.displayPlaylist();



System.out.println();
MultiplayerGameList gamelist1=new MultiplayerGameList();
gamelist1.addPlayer("Sakeena");
gamelist1.addPlayer("Aleena");
gamelist1.addPlayer("Kamiya");
gamelist1.addPlayer("Shafiya");

gamelist1.displayPlayers();
gamelist1.nextTurn();
gamelist1.removePlayer("Shafiya");
gamelist1.displayPlayers();



    }



}