// MultiTangkap.java
// Contoh multiple catch: menangani indeks di luar jangkauan dan kesalahan input
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTangkap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan indeks array: ");
            int index = sc.nextInt();

            int[] angka = {10, 20, 30, 40};
            System.out.println("Nilai pada indeks " + index + " adalah " + angka[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks di luar jangkauan array!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan lain: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
