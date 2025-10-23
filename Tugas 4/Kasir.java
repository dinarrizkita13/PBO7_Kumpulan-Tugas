
package tugasp4;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        String member = input.next().toLowerCase();

        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = input.nextDouble();

        System.out.print("Masukkan jumlah uang yang dibayarkan (Rp): ");
        double uangDibayar = input.nextDouble();

        double diskon = 0;

        if (member.equals("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = totalBelanja - diskon;
        double kembalian = uangDibayar - totalBayar;

        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Total Belanja     : Rp" + totalBelanja);
        System.out.println("Diskon            : Rp" + diskon);
        System.out.println("Total yang Dibayar: Rp" + totalBayar);
        System.out.println("Uang Pembeli      : Rp" + uangDibayar);
        System.out.println("Kembalian         : Rp" + kembalian);
    }
}
