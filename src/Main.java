import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number = 0;
        double result = 0;
        boolean inputResult;

        do {
            System.out.print("Введите число: ");
            try {
                inputResult = true;
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextDouble();
                if (number < 0) {
                    throw new Exception();
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка, вы ввели отрицательное число");
                inputResult = false;
            } catch (Exception e) {
                System.out.println("Ошибка, вы ввели не число");
                inputResult = false;
            }
        } while (!inputResult);

        result = Math.sqrt(number);
        System.out.println("квадратный корень числа " + number + " = " + result);
    }
}