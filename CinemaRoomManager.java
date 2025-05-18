import java.util.Scanner;
import java.lang.String;
public class CinemaRoomManager {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = input.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seat = input.nextInt();
        int totalSeat = row * seat;
        double income = 0;
        double total = main.totalIncome(row, seat);
        String[][] cinema = main.Cinema(row, seat);
        while(flag){
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            switch (input.nextInt()) {
                case 1:
                    main.printCinema(cinema);
                    break;
                case 2:
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println();
                        System.out.println();
                       System.out.println("Enter a row number:");
                       int rowToBook = input.nextInt();
                       System.out.println("Enter a seat number in that row:");
                    
                       int seatToBook = input.nextInt();
                        
                        if(rowToBook > row || seatToBook > seat){
                            System.out.println("Wrong input!");
                        } 
                        else if(cinema[rowToBook][seatToBook] == "B"){
                            System.out.println("That ticket has already been purchased!");
                        }
                        else {
                            income += main.ticketPricing(row, seat, rowToBook, seatToBook, cinema);
                            flag1 = false;
                        }
                    }
                    break;
                case 3:
                    int ticketPurchased = Statistics.countTicket(cinema);
                    System.out.println("Number of purchased tickets: "+ ticketPurchased);
                    double per = ((double)ticketPurchased/totalSeat) * 100;
                    System.out.println("Percentage: " + String.format("%.2f",per) +"%");
                    System.out.println("Current income: $" + Math.round(income));
                    System.out.println("Total income: $" + Math.round(total));
                    
                    break;
                case 0:
                    flag = false;
                    break;
                
            }
        }
    }
    
}
