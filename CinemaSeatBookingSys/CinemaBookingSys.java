import java.util.Scanner;

public class CinemaBookingSys{

private static int rows=10;
private static int cols=10;
private static char seats[][]=new char[rows][cols];
private static Scanner sc=new Scanner(System.in);


public static void main(String args[]){
  initializeSeats();
  System.out.println("                               Quick info before use: 0/false= free seat 1/true=reserved seat                                       ");

  while(true){
    showMenu();
    System.out.print("             Enter your choice: ");
    int choice=sc.nextInt();


    switch (choice) {
case 1:    
            showseatChart();
            break;
case 2:
            bookAseat();
            break;
case 3:
            cancelBooking();
            break;     
case 4:
            CheckAvailable();
            break;

case 5:
           showStatistics();
            break;
case 6:
            System.out.println("(GOODBYE------:))");
            return;

        default: System.out.println("INVALID CHOICE. ");
            break;
    }
  }
}


//initialize seats
private static void initializeSeats(){
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols;j++){
            seats[i][j]='0';
        }
    }
}
    //show menu
    private static void showMenu(){
 System.out.println("=======CINEMA SEAT BOOKING SYSTEM=======");
 System.out.println("1. view Seating chart.");
 System.out.println("2. Book a seat.");
 System.out.println("3. cancel Booking.");
 System.out.println("4. Chcek seat availablity.");
 System.out.println("5. View statistics.");
 System.out.println("6. exit.");
 System.out.println("=========================================");
    }
    //view seating chart
    private static void showseatChart(){
 System.out.println("------------SEATING CHART-----------");
  System.out.println();
   System.out.print("    ");
 for(int j=0; j<cols; j++){
    System.out.print(+(j+1) +"    ");
 }
 System.out.println();

for(int i=0; i<rows; i++){
 System.out.print((char)('A'+i)+ "   ");
 for(int j=0; j<cols; j++){
 System.out.print("["+seats[i][j]+"]  ");
 }
  System.out.println();
}

    }


    //book a seat
    private static void bookAseat(){
System.out.print("Enter the row(A-J): ");
char rowC=sc.next().toUpperCase().charAt(0);
System.out.print("Enter the column(1-10): ");
int colC=sc.nextInt();
sc.nextLine();
int rowInd=rowC-'A';
int colInd=colC-1;
if(!isSeatValid(rowInd, colInd)){
    System.out.println("THE SEAT IS INVALID. CAN NOT PROCESS BOOKING!");
    return;
}
if(seats[rowInd][colInd]=='1'){
System.out.println("Seat "+rowC+colC+" is already booked!");
return;
}
else{
    seats[rowInd][colInd]='1';
System.out.println("Seat "+rowC+colC+" booked successfully!");
}


}
    //cancel booking
    private static void cancelBooking(){
System.out.print("Enter the row(A-J): ");
char rowC=sc.next().toUpperCase().charAt(0);
System.out.print("Enter the column(1-10): ");
int colC=sc.nextInt();
sc.nextLine();
int rowInd=rowC-'A';
int colInd=colC-1;
if(!isSeatValid(rowInd, colInd)){
    System.out.println("THE SEAT IS INVALID. CAN NOT PROCESS BOOKING!");
    return;
}
if(seats[rowInd][colInd]=='0'){
System.out.println("Seat "+rowC+colC+" is already not reserved!");
return;
}
else{
    seats[rowInd][colInd]='0';
System.out.println("Seat "+rowC+colC+" unreserved successfully!");
}
    }
    //check seats availablity
    private static void CheckAvailable(){
System.out.print("Enter the row(A-J): ");
char rowC=sc.next().toUpperCase().charAt(0);
System.out.print("Enter the column(1-10): ");
int colC=sc.nextInt();
sc.nextLine();
int rowInd=rowC-'A';
int colInd=colC-1;
if(!isSeatValid(rowInd, colInd)){
    System.out.println("THE SEAT IS INVALID. CAN NOT PROCESS availablity!");
    return;
}
if(seats[rowInd][colInd]=='1'){
System.out.println("Seat "+rowC+colC+" is NOT AVAILABLE!");
return;
}
else{
System.out.println("Seat "+rowC+colC+" IS AVAILABLE!");
return;
}
    }
    //view statistics
    private static void showStatistics(){
        int reserveCount=0, unreserveCount=0;
for(int i=0; i<rows; i++){
    for(int j=0; j<cols; j++){
if(seats[i][j]=='0'){
    unreserveCount++;
}else{
    reserveCount++;
}
    }
}

int total=rows*cols;
double percentBooked= (double)reserveCount/total*100;
 System.out.println("\n=========Statistics==========\n");
 System.out.println("Total seats: "+total);
 System.out.println("Booked seats: "+reserveCount);
 System.out.println("Unbooked seats: "+unreserveCount);
 System.out.println("Occupancy %: "+percentBooked+"%");
    }


    //check seat validity
    private static boolean isSeatValid(int row, int col){
     return row>=0 && row<rows && col>=0 && col<cols;
    }
  
}