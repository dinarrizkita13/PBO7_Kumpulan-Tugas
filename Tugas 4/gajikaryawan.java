package tugasP4;

import java.util.Scanner;

public class gajikaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = input.nextInt();

        System.out.print("Masukkan Status Pernikahan (menikah/belum/cerai): ");
        String status = input.next();

        System.out.print("Masukkan Jumlah Anak: ");
        int anak = input.nextInt();

        double gajiPokok = 0;
        switch (golongan) {
            case 1:
                status = "menikah";
                gajiPokok = 1200000;
                break;
            case 2:
                status = "belum menikah";
                gajiPokok = 1500000;
                break;
            case 3:
                status = "cerai";
                gajiPokok = 1750000;
                break;
            case 4:
                status = "menikah dan punya anak";
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                break;
        }
        double tunjanganPasangan = 0;
        double tunjanganAnak = 0;

        if (status.equalsIgnoreCase("menikah")) {
            tunjanganPasangan = 0.10 * gajiPokok; 
        }

        if (anak > 0) {
            tunjanganAnak = 0.05 * gajiPokok * anak;
        }

        double gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;

        System.out.println("Slip Gaji Karyawan");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Golongan           : " + golongan);
        System.out.println("Gaji Pokok         : Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan : Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak     : Rp" + tunjanganAnak);
        System.out.println("Gaji Bersih        : Rp" + gajiBersih);
    }
}
