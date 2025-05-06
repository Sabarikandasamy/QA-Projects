package Other_Projects.Task_31_Jan;

import java.util.Scanner;

public class Number_is_Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's A Palindrome: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome. ");
        } else {
            System.out.println(number + " is not a palindrome. ");
        }
        sc.close();
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;

        // handle negative numbers (they can't be palindrome
        if (number < 0) {
            return false;
        }

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }

        // compare original with reversed
        return originalNumber == reverseNumber;
    }
}