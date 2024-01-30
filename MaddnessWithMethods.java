import java.util.Scanner;

class MaddnessWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var num1 = getAnIntFromTheUser(scanner);
        int num2 = getAnIntFromTheUser(scanner);

        int comparison =Integer.compare(num1, num2);
//
//        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println(num1 + " is " + comparison + " than " + num2);
    }

    // Method to get an integer from the user
    public static int getAnIntFromTheUser(Scanner scanner) {
        System.out.print("Please enter an integer: ");
        return scanner.nextInt();
    }

}