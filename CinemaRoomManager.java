import java.util.Scanner;
public class CinemaRoomManager {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = input.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int seat = input.nextInt();

        while(flag){
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            switch (input.nextInt()) {
                case 1:
                    main.printCinema(main.Cinema(row, seat));
                    break;
                case 2:
                    break;
                case 0:
                    break;
                
            }
        }
    }
}
