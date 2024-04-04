import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println(getPowerOfNumber(5, 0));
        //Task 2
        getCalculator();
    }

    public static double getPowerOfNumber(double number, int power) {
        double result = 1;

        if (power > 0) {
            for (int i = 0; i < power; i++) {
                result *= number;
            }
        } else if (power < 0) {
            for (int i = 0; i < -power; i++) {
                result /= number;
            }
        }

        return result;
    }

    public static void getCalculator() {
        System.out.println("Choose an operation: \n 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.print("Enter first number : ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter second number : ");
        double secondNumber = sc.nextDouble();
        switch (choice) {
            case 1 -> getAdd(firstNumber, secondNumber);
            case 2 -> getSubtract(firstNumber, secondNumber);
            case 3 -> getMultiply(firstNumber, secondNumber);
            case 4 -> getDivide((float) firstNumber, (float) secondNumber);
        }

    }

    public static void getAdd(double firstNumber, double secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    public static void getSubtract(double firstNumber, double secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    public static void getMultiply(double firstNumber, double secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    public static void getDivide(float firstNumber, float secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Cannot be divided by zero");
        } else {
            System.out.println(firstNumber / secondNumber);
        }
    }

}