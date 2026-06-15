import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum = " + sum);

        

        int temp = firstNumber;
        firstNumber = sum;
        sum = temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("First Number = " + firstNumber);
        System.out.println("Sum = " + sum);

        input.close();
    }
}