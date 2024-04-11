/**
 * @author Himal Shrestha
 * Course: CSC 229 Data Structures & Algorithims
 * Prof: Dr. Moaath Alrajab
 * Assignment: Lab 08
 * Desc:
 * The `PrimeUtils` class provides a static method to efficiently determine if a given integer is a prime number through
 * optimized division checks up to the square root of the number.
 */
// Define the PrimeUtils class which contains utility methods related to prime numbers.
public class PrimeUtils {
    // Declare a static method isPrime that takes an integer 'number' and returns a boolean indicating whether it is a prime number.
    public static boolean isPrime(int number) {
        // If the input number is less than or equal to 1, return false because 1 and negative numbers are not prime.
        if (number <= 1) {
            return false;
        }
        // Start a loop from 2 and continue as long as i squared is less than or equal to 'number'.
        // This optimizes the loop to avoid unnecessary checks beyond the square root of 'number'.
        for (int i = 2; i * i <= number; i++) {
            // For each 'i', check if 'number' is divisible by 'i'.
            if (number % i == 0) {
                // If 'number' is divisible by any 'i', it is not a prime number, so return false.
                return false;
            }
        }
        // If no divisors were found in the loop, 'number' is a prime, so return true.
        return true;
    }
}
