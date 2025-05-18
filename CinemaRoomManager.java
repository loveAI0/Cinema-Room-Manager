import java.util.Scanner;
public class CinemaRoomManager {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = input.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seat = input.nextInt();
        int totalSeat = row * seat;
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
                    System.out.println("Enter a row number:");
                    int rowToBook = input.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int seatToBook = input.nextInt();
                    main.ticketPricing(row, seat, rowToBook, seatToBook, cinema);
                    break;
                case 3:
                    int ticketPurchased = Statistics.countTicket(cinema);
                    System.out.println("Number of purchased tickets: "+ ticketPurchased);
                    double per = ((double)ticketPurchased/totalSeat) * 100;
                    System.out.println("Percentage: " + per);
                    
                    break;
                case 0:
                    flag = false;
                    break;
                
            }
        }
    }
}
