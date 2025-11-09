import java.util.Scanner;

public class No4_GanjilJumlah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka: ");
        int n = input.nextInt();
        int total = 0, bil = 1;

        System.out.print("Angka ganjil: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(bil + " ");
            total += bil;
            bil += 2;
        }

        System.out.println("\nTotal penjumlahan: " + total);
    }
}