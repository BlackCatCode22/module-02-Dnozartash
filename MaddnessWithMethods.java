import java.util.Scanner;

public class MaddnessWithMethods {

    public static int getAnIntFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    public static int compareTwoInts(int a, int b) {
        return Integer.compare(a, b);
    }

    public static int sumTwoInts(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        int comparisonResult;
        int sum;

        // Get the first number from the user
        firstNumber = getAnIntFromTheUser();

        // Get the second number from the user
        secondNumber = getAnIntFromTheUser();

        // Compare the two numbers
        comparisonResult = compareTwoInts(firstNumber, secondNumber);

        // Print the comparison result
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the second number.");
        } else if (comparisonResult == -1) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The numbers are equal.");
        }

        // Sum the two numbers
        sum = sumTwoInts(firstNumber, secondNumber);

        // Print the sum
        System.out.println("The sum of the two numbers is: " + sum);
    }
}