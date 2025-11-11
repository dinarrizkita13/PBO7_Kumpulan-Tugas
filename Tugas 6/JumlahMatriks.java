// JumlahMatriks.java
// Program untuk menjumlahkan semua elemen matriks yang ukurannya ditentukan runtime
import java.util.Scanner;

public class JumlahMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah baris: ");
        int r = sc.nextInt();
        System.out.print("Jumlah kolom: ");
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        System.out.println("Masukkan elemen matriks:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = sc.nextInt();
            }

        int total = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                total += A[i][j];

        System.out.println("Jumlah semua elemen matriks = " + total);
        sc.close();
    }
}
