import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10:");

        int number = scanner.nextInt();
        try {
            System.out.println("Factorial of " + number + " is " + calculateFactorial(number));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculateFactorial(int number) throws Exception {
        if (number < 1 || number > 10) {
            throw new Exception("Invalid number! Please enter a number between 1 to 10.");
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
