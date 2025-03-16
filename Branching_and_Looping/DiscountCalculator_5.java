package Branching_and_Looping;

import java.util.Scanner;

public class DiscountCalculator_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double discount = 0;

        if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 0.10 * purchaseAmount;
        } else if (purchaseAmount > 1000) {
            discount = 0.20 * purchaseAmount;
        }

        double finalAmount = purchaseAmount - discount;
        System.out.println("Final Payable Amount: " + finalAmount);

        scanner.close();
    }
}
