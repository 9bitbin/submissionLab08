/**
 * @author Himal Shrestha
 * Course: CSC 229 Data Structures & Algorithims
 * Prof: Dr. Moaath Alrajab
 * Assignment: Lab 08
 * Desc:
 * The Main class populates a SinglyLinkedList with prime numbers up to a specified limit, filters out primes
 * containing the digit '3' into a separate list, and calculates the sum of these filtered primes,
 * showcasing the integration of prime number identification with linked list operations in Java.
 */
import java.util.Scanner; // Import the Scanner class.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input.
        System.out.println("Enter the upper limit for prime number generation: ");
        int n = scanner.nextInt(); // Read the upper limit 'n' from the user input.

        // Create an instance of SinglyLinkedList to store prime numbers.
        SinglyLinkedList primeList = new SinglyLinkedList();

        // Loop through numbers from 2 to n to find prime numbers.
        for (int i = 2; i <= n; i++) {
            // Use the isPrime method from PrimeUtils to check if the current number is prime.
            if (PrimeUtils.isPrime(i)) {
                // If the number is prime, add it to the primeList linked list.
                primeList.add(i);
            }
        }

        // Filter the primeList to find and remove primes with the digit '3',
        // moving them to a new list primesWithDigit3.
        SinglyLinkedList primesWithDigit3 = primeList.filterAndRemoveIfContains3();

        // Calculate the sum of the numbers in primesWithDigit3.
        int sumOfPrimesWith3 = primesWithDigit3.sum();

        // Print the sum of prime numbers containing the digit '3'.
        System.out.println("Sum of prime numbers with digit 3: " + sumOfPrimesWith3);

        scanner.close(); // Close the scanner.
    }
}
