import java.util.Scanner;

public class TebakTanggal {
    // method yang menerima bulan (1..12) dan tanggal (1..31)
    // mengembalikan angka format MDD (misal bulan=1,tgl=14 -> 114)
    public static int encodeBulanTanggal(int bulan, int tanggal) {
        return bulan * 100 + (tanggal); // contoh: 1*100 + 14 = 114
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan (1-12): ");
        int b = sc.nextInt();
        System.out.print("Masukkan tanggal (1-31): ");
        int t = sc.nextInt();
        System.out.println("Hasil akhir (MDD) = " + encodeBulanTanggal(b, t));
        sc.close();
    }
}
