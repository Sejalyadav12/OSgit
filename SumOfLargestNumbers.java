import java.util.Scanner;

public class SumOfLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double sum = sumOfLargest(num1, num2, num3);
        System.out.println("The sum of the largest two numbers is: " + sum);
    }

    public static double sumOfLargest(double a, double b, double c) {
        if (a <= b && a <= c) {
            return b + c;
        } else if (b <= a && b <= c) {
            return a + c;
        } else {
            return a + b;
        }
    }
}
