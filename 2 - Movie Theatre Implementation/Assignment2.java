//Simulate a movie theater that helps users to book and reserve seats.
//reserve seats (if seat is taken, let them know it is taken and suggest an available seat)
//cancel seats
//retrieve initial seating charting

public class Assignment2 {
    public final int[][] seatingArray;

    public movieTheatre (int rows, int colums) {
        seatingArray = new string[rows][colums];
    }

    // Default seating arrangements
    private void seatingMap() {
        for (int rows = 0; rows < seatingArray.length; rows++) {
            for (int columns = 0; columns < seatingArray[rows].length; columns++) {
                seatingArray[rows][columns] = "Available!";
            }
        }
    }

    private boolean seatNumber(int rows, int columns){
        return rows >= 0 && rows < seatingArray.length && columns >= 0 && columns < seatingArray[0].length;
    }

    // Suggestions
    private void suggestedSeating() {
        for (int rows = 0; rows < seats.length; rows++) {
            for (int columns = 0; columns < seats[rows].length; columns++) {
                if (seatingArray[rows][columns] == 0) {
                    System.out.println("SUGGESTED SEAT: Row: " + rows + ", Column: " + columns);
                    return;
                }
            }
        }
        System.out.println("Unfortunately, there are no available seats. Please try again later.");
    }

    // Reserve a seat
    public void reserveSeat(int rows, int columns) {
        if (!seatNumber(rows, columns)) {
            System.out.println("ERROR: Invalid seat selection.");
        } else if (seatingArray[rows][columns] == 1){
            System.out.println("Selected seat is already reserved. Please try again.");
            suggestedSeating();
        } else {
            seatingArray[rows][columns] = 1;
            System.out.println("SUCCESS: Seat reserved! Enjoy the show.");
        }
    }

    // Cancel a seat
    public void cancelSeat(int rows, int columns) {
        if (!seatNumber(rows, columns)) {
            System.out.println("ERROR: Invalid seat selection.");
        } else if (seatingArray[rows][columns] == 0){
            System.out.println("Selected seat is already available. Please try again.");
        } else {
            seatingArray[rows][columns] = 0;
            System.out.println("SUCCESS: Seat cancelled! Thank you for your visit.");
        }
    }

    // Retrieving seating chart
    // does seatingMap fit this? if not, maybe this works idk:
    public void retrieveSeatingChart() {
        System.out.println("Available Seating Chart:");
        for (int rows = 0; rows < seatingArray.length; rows++) {
            for (int columns = 0; columns < seatingArray[i].length; columns++) {
                System.out.printf("Seat (%d, %d): %s  ", rows, columns, seatingArray[i][j]);
            }
            System.out.println("Ready to reserve?");
        }
    }

    // Test method
    public static void main(String[] args) {
        Assignment2 movieTheatre = new Assignment2(9, 9);
        movieTheatre.seatingMap();
        movieTheatre.reserveSeat(3, 7);
        movieTheatre.reserveSeat(5, 3);
        movieTheatre.reserveSeat(7, 5);
        movieTheatre.cancelSeat(3, 7);
        movieTheatre.retrieveSeatingChart();
    }
}