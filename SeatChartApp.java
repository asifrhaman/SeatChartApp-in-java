import java.util.Scanner;

public class SeatChartApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[][] seatingChart = new char[5][6];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 6; j++) {
        seatingChart[i][j] = 'A';
      }
    }

    boolean exit = false;
    while (!exit) {
      System.out.println("1. Seating Chart");
      System.out.println("2. Book a Seat");
      System.out.println("3. Cancel a Booking");
      System.out.println("4. Exit");
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Seating Chart:");
          System.out.print(" ");
          for (int j = 1; j <= 6; j++) {
            System.out.print("Seat " + j + "  ");
          }
          System.out.println();
          System.out.println("      -------------------");
          for (int i = 0; i < 5; i++) {
            System.out.print("Row " + (i + 1) + " |  ");
            for (int j = 0; j < 6; j++) {
              System.out.print(seatingChart[i][j] + "  ");
            }
            System.out.println();
          }
          System.out.println();
          break;
        case 2:
          System.out.print("Enter row number: ");
          int row = scanner.nextInt();
          System.out.print("Enter seat number: ");
          int seat = scanner.nextInt();
          if (row >= 1 && row <= 5 && seat >= 1 && seat <= 6) {
            if (seatingChart[row - 1][seat - 1] == 'A') {
              seatingChart[row - 1][seat - 1] = 'B';
              System.out.println("Seat booked successfully!");
            } else {
              System.out.println("Seat is already booked.");
            }
          } else {
            System.out.println("Invalid row or seat number.");
          }
          break;
        case 3:
          System.out.print("Enter row number: ");
          row = scanner.nextInt();
          System.out.print("Enter seat number: ");
          seat = scanner.nextInt();
          if (row >= 1 && row <= 5 && seat >= 1 && seat <= 6) {
            if (seatingChart[row - 1][seat - 1] == 'B') {
              seatingChart[row - 1][seat - 1] = 'A';
              System.out.println("Booking canceled successfully!");
            } else {
              System.out.println("Seat is not booked.");
            }
          } else {
            System.out.println("Invalid row or seat number.");
          }
          break;
        case 4:
          exit = true;
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice.");
      }
    }

    scanner.close();
  }
}