// PenangananException.java
// Contoh penanganan exception: pembagian dengan penanganan pembagi nol dan error input
import java.util.Scanner;

public class PenangananException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan angka pembilang: ");
            int a = sc.nextInt();
            System.out.print("Masukkan angka penyebut: ");
            int b = sc.nextInt();
            int hasil = a / b;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } catch (Exception e) {
            System.out.println("Kesalahan input: " + e.getMessage());
        } finally {
            System.out.println("Program selesai dijalankan.");
            sc.close();
        }
    }
}
