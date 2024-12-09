package lab;

import java.util.Scanner;

public class DigitSum {

    // Recursive function to calculate sum of digits
    public static int sumOfDigits(int number) {
        if (number < 0) number = -number; // Convert negative to positive
        if (number == 0) return 0; // Base case

        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  // Read user input

        System.out.println("Sum of digits: " + sumOfDigits(number));
        
        scanner.close();  // Close the scanner resource
    }
}
