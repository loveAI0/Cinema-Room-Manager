import java.util.Scanner;
public class main {
   public static void main(String[] args){

    /*  this is already implement using Cinema method.
        for(int i = 0; i < 9; i++ ){
            if(i == 0){
                System.out.println("Cinema:");
            }

            if(i == 1){
                System.out.println("  "+ "1 2 3 4 5 6 7 8");
            }
            else System.out.println((i - 1) + " S S S S S S S S");
        }
    */
        // input total row and seats per row
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = input.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seat = input.nextInt();
    

        // main.totalIncome(row, seat); not implement only in stage 2

        main.Cinema(row, seat);


   }
   static void Cinema(int row, int seat){
        
        String[][] cinema = new String[row+1][seat+1];
        for(int i = 0; i < row + 1 ; i++ ){
            for(int j = 0; j < seat + 1; j++){
                
                if(i == 0 && j == 0){
                    cinema[0][0] = " ";
                }
                else if(i == 0 && j > 0){
                    cinema[i][j] = "" + j;
                }
                else if(i > 0 && j == 0){
                    cinema[i][0] = "" + i;
                }
                else{
                    cinema[i][j] = "S";
                } 

            }
        }

        printCinema(cinema);
        Scanner input1 = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int rowToBook = input1.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seatToBook = input1.nextInt();
        input1.close();

        ticketPricing(row, seat, rowToBook, seatToBook, cinema);
      

   }
   static void printCinema(String [][] cinema){
        System.out.println();

        System.out.println("Cinema:");
        for (String[] eachRow : cinema) { // Iterates over each row (which is an array)
            for (String num : eachRow) {  // Iterates over each element in the row
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
   }
/* 
   // total income from the Cinema Room
   static void totalIncome(int row, int seat){
        double total = 0;
        double ticketPrice = 0;
        double totalSeat = row * seat;
        if(totalSeat <= 60){
            ticketPrice = 10;
            total = row * seat * ticketPrice;
        }
        else{
            // this handles both odd and even row as Int is used.
            int frontRow = row / 2;
            double ticketPrice_Front = 10;
            int backRow = row - frontRow ;
            double ticketPrice_back = 8;
            total = seat * frontRow * ticketPrice_Front + seat * backRow * ticketPrice_back;
        }
        System.out.println("Total income:"+"\n"+"$" + Math.round(total));
   }
*/

    public static void ticketPricing(int row, int seat, int rowToBook, int seatToBook, String [][] cinema){
        
        
        double ticketPrice = 0;
        double totalSeat = row * seat;
        
        if(totalSeat <= 60){
            ticketPrice = 10;
            System.out.println();

            System.out.println("Ticket price: $" + Math.round(ticketPrice)+ "\n");
            cinema[rowToBook][seatToBook] = "B";

            
            printCinema(cinema);

        }
        else{
            // this handles both odd and even row as Int is used.
            int frontRow = row / 2;

            if(rowToBook <= frontRow){
                double ticketPrice_Front = 10;
                System.out.println();

                System.out.println("Ticket price: $" + Math.round(ticketPrice_Front) + "\n");
                cinema[rowToBook][seatToBook] = "B";
                printCinema(cinema);
            }
       
            else {
                double ticketPrice_back = 8;
                System.out.println();

                System.out.println("Ticket price: $" + Math.round(ticketPrice_back) + "\n");
                cinema[rowToBook][seatToBook] = "B";
                printCinema(cinema);
            }
        }   
    }
}