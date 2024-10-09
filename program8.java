import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        long factorial = factorial(number);
        
        // Adding spaces between words
        System.out.println("Factorial  of  " + number + "  (Recursive):  " + factorial);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        }
        return n * factorial(n - 1); // Recursive call
    }
}
