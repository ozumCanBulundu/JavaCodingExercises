/*
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.

Check the tips below for more info about palindromes.

Example Input/Output

isPalindrome(-1221); → should return true

isPalindrome(707); → should return true

isPalindrome(11212); → should return false because number is 21211 and that is not equal to 11212.

Tip: What is a Palindrome number?  A palindrome number is a number which when numberd is equal to the original number. For example: 121, 12321, 1001 etc.

Tip: Logic to check a palindrome number

Find the number of the given number. Store it in some variable say number. Compare the number with number.

If both are the the same then the number is a palindrome otherwise it is not.

Tip: Logic to number a number

Declare and initialize another variable to store the number of a number, for example number = 0.

Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of number by one.
To increase place value multiply the number variable by 10 e.g. number = number * 10.
Add lastDigit to number.
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
Repeat steps until number is not equal to (or greater than) zero.

A while loop would be good for this coding exercise.


Tip: Be careful with negative numbers. They can also be palindrome numbers.

Tip: Be careful with reversing a number, you will need a parameter for comparing a numberd number with the starting number (parameter).

NOTE: The method isPalindrome needs to be defined as public static like we have been doing
 */

public class NumberPalindrome
{
    public static boolean isPalindrome(int number)
    {
        if (number < 0)
        {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0)
        {
            // extract the lest-significant digit
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            // drop the least-significant digit
            stored /= 10;   // same as number = number / 10;
        }

        if (number == reverse)
            return true;
        else
            return false;


    }

}
