package Branching_and_Looping;

import java.util.Scanner;

public class FindSmallNumber_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int smallest = Math.min(num1, Math.min(num2, num3));

        System.out.println("The smallest number is: " + smallest);

        scanner.close();
    }
}
