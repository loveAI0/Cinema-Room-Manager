import java.util.Scanner;
public class main {
   public static void main(String[] args){
        for(int i = 0; i < 9; i++ ){
            if(i == 0){
                System.out.println("Cinema:");
            }

            if(i == 1){
                System.out.println("  "+ "1 2 3 4 5 6 7 8");
            }
            else System.out.println((i - 1) + " S S S S S S S S");
        }
        // input total row and seats per row
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = input.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seat = input.nextInt();
        main.totalIncome(row, seat);

   }
   static void totalIncome(int row, int seat){
        double total = 0;
        double ticketPrice = 0;
        double totalSeat = row * seat;
        if(totalSeat <= 60){
            ticketPrice = 10;
            total = row * seat * ticketPrice;
        }
        else{
            if(row % 2 != 0){
                 int frontRow = row / 2;
                 double ticketPrice_Front = 10;
                 int backRow = row - frontRow ;
                 double ticketPrice_back = 8;
                 total = seat * frontRow * ticketPrice_Front + seat * backRow * ticketPrice_back;
            }
            else{
                int frontRow = row / 2;
                double ticketPrice_Front = 10;
                int backRow = row - frontRow ;
                double ticketPrice_back = 8;
                total =  seat * frontRow * ticketPrice_Front + seat * backRow * ticketPrice_back;
            }
        }
        System.out.println("Total income:"+"\n"+"$" + Math.round(total));
   }
}