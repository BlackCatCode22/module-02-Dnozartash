import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getAnIntFromTheUser(scanner);
        int num2 = getAnIntFromTheUser(scanner);

        int sum = sumTwoInts(num1, num2);
        String comparison = compareTwoInts(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println(num1 + " is " + comparison + " than " + num2);
    }

    // Method to get an integer from the user
    public static int getAnIntFromTheUser(Scanner scanner) {
        System.out.print("Please enter an integer: ");
        return scanner.nextInt();
    }

    // Method to compare two integers
    public static String compareTwoInts(int num1, int num2) {
        if (num1 > num2) {
            return "greater than";
        } else if (num1 < num2) {
            return "less than";
        } else {
            return "equal to";
        }
    }

    // Method to sum two integers
    public static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }
}