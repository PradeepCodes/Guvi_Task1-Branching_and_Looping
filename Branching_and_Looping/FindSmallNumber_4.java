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

        int smallestIfElse;
        if (num1 <= num2 && num1 <= num3) {
            smallestIfElse = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallestIfElse = num2;
        } else {
            smallestIfElse = num3;
        }
        System.out.println("The smallest number using if-else is: " + smallestIfElse);
        
        int smallestTernary = (num1 <= num2 && num1 <= num3) ? num1 :
                (num2 <= num1 && num2 <= num3) ? num2 : num3;
        System.out.println("The smallest number using ternary operator is: " + smallestTernary);

        scanner.close();
    }
}
