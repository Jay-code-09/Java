import java.util.Scanner;

public class Calcy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        while (true) {
            System.out.println("Enter operation (+, -, *, /, %) or 'x' to exit:");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting the calculator.");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter number 1:");
                int a = sc.nextInt();

                System.out.println("Enter number 2:");
                int b = sc.nextInt();

                if (op == '+') {
                    result = a + b;
                } else if (op == '-') {
                    result = a - b;
                } else if (op == '*') {
                    result = a * b;
                } else if (op == '/') {
                    if (b == 0) {
                        System.out.println("Error: Division by zero.");
                        continue;
                    }
                    result = a / b;
                } else { // %
                    if (b == 0) {
                        System.out.println("Error: Modulus by zero.");
                        continue;
                    }
                    result = a % b;
                }

                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        }

        sc.close();
    }
}
