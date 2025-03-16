package Branching_and_Looping;

public class NumberPatter_5 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((n - j) + " ");
            }
            for (int k = i + 1; k < n; k++) {
                System.out.print((n - i) + " ");
            }
            System.out.println();
        }
    }
}
