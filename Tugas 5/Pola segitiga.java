import java.util.Scanner;

public class No5_TrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int t = input.nextInt();

        System.out.println("Half Triangle:");
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle:");
        for (int i = t; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}