import java.util.Scanner;

public class KelilingPersegi {
    // method untuk menghitung keliling (masukan sisi)
    public static int hitungKeliling(int sisi) {
        return 4 * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        int s = sc.nextInt();
        System.out.println("Keliling persegi = " + hitungKeliling(s));
        sc.close();
    }
}
