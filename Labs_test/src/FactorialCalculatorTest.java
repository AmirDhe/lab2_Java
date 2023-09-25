public class FactorialCalculatorTest {

    public static void main(String[] args) {
        testFactorialCalculator(5);
        testFactorialCalculator(0);
        testFactorialCalculator(11);
    }

    public static void testFactorialCalculator(int number) {
        try {
            System.out.println("Factorial of " + number + " is " + FactorialCalculator.calculateFactorial(number));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

