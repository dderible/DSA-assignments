// Calculate the avarage temperature, and give how many days are above the avarage temperature
//  1. Take an input from the user (eg. 5)
//  2. Prompt the user to enter all the 5 numbers (temperature values)
//  3. Calculate the avarage temperature
//  4. Given the avarage temperature, how many of the numbers in the line 2 are above the avarage temperature?

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Amount of Days: ");
        int days = scanner.nextInt();
        double[] temps = new double[days];

        for (int i = 0; i < days; i++) {
            System.out.println("Enter Temperature " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
        }

        double total = 0;
        for (int i = 0; i < days; i++) {
            total += temps[i];
        }

        double average = total / days;
        System.out.println("Your Average Temperature: " + average);

        int daysAboveAverage = 0;
        for (double temperatures : temps) {
            if (temperatures > average) {
                daysAboveAverage++;
            }
        }
        System.out.println("Your Above Average Days: " + daysAboveAverage);
    }
}