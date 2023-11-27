import java.util.Scanner;
public class InputMismatchExceptionEx {
    public static void main(String[] args){


                Scanner scanner = new Scanner(System.in);

                int num1, num2;
                boolean validInput = false;

                do {
                    System.out.print("Enter the first integer: ");
                    num1 = scanner.nextInt();

                    System.out.print("Enter the second integer: ");
                    num2 = scanner.nextInt();

                    int sum = num1 + num2;
                    System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

                    validInput = true;
                } while (!validInput);

                scanner.close();

    }
}
