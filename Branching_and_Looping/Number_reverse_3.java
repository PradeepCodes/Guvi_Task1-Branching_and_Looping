package Branching_and_Looping;
import java.util.Scanner;

public class Number_reverse_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversed = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + reversed);

        scanner.close();
    }
}
