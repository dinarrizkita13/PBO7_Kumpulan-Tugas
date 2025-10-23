
package tugasp4;
import java.util.Scanner;

public class kodehari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode hari (1-7): ");
        int kodehari = input.nextInt();

        String namahari;

        switch (kodehari) {
            case 1:
                namahari = "Senin";
                break;
            case 2:
                namahari = "Selasa";
                break;
            case 3:
                namahari = "Rabu";
                break;
            case 4:
                namahari = "Kamis";
                break;
            case 5:
                namahari = "Jumat";
                break;
            case 6:
                namahari = "Sabtu";
                break;
            case 7:
                namahari = "Minggu";
                break;
            default:
                namahari = "Kode hari tidak valid!";
                break;
        }

        System.out.println("Hari ke-" + kodehari + " adalah " + namahari);
    }
}