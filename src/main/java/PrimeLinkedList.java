/**
 * @author Himal Shrestha
 * Course: CSC 229 Data Structures & Algorithims
 * Prof: Dr. Moaath Alrajab
 * Assignment: Lab 08
 * Desc:
 * The PrimeLinkedList class demonstrates finding and summing prime numbers containing the digit '3' within a specified
 * range using custom singly linked list operations and prime number utilities in Java.
 */
// Define the PrimeLinkedList class that contains the main method.
public class PrimeLinkedList {
    // The main method is the entry point of the program.
    public static void main(String[] args) {
        // Define and initialize the variable 'n' with a value of 100, which represents the upper limit for prime number generation.
        final int n = 100; // Change this value as needed to test with different ranges.

        // Create an instance of the SinglyLinkedList class to store the prime numbers.
        SinglyLinkedList primeList = new SinglyLinkedList();

        // Iterate over numbers from 0 to 'n' (inclusive) to find prime numbers.
        for (int i = 0; i <= n; i++) {
            // Check if the current number 'i' is a prime number using the isPrime method of the PrimeUtils class.
            if (PrimeUtils.isPrime(i)) {
                // If 'i' is prime, add it to the 'primeList' linked list.
                primeList.add(i);
            }
        }

        // Call the filterAndRemoveIfContains3 method on 'primeList' to filter out prime numbers containing the digit '3'.
        // This method also returns a new SinglyLinkedList containing only the filtered prime numbers.
        SinglyLinkedList primesWithDigit3 = primeList.filterAndRemoveIfContains3();

        // Print the sum of the prime numbers that contain the digit '3', which is calculated by the sum method of the 'primesWithDigit3' list.
        System.out.println("Sum of prime numbers with digit 3: " + primesWithDigit3.sum());
    }
}
