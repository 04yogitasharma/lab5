package lab5;

import java.util.ArrayList;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add integers to the ArrayList
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(20);
        numbersList.add(25);
        numbersList.add(30);
        numbersList.add(35);

        // Variable to store the sum of even numbers
        int sumOfEvenNumbers = 0;

        // Iterate through the ArrayList and calculate the sum of even numbers
        for (int number : numbersList) {
            if (number % 2 == 0) {  // Check if the number is even
                sumOfEvenNumbers += number;
            }
        }

        // Display the result
        System.out.println("The sum of all even numbers is: " + sumOfEvenNumbers);
    }
}

