/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class GajiPegawai {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data pegawai
        System.out.print("Masukkan NIK: ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        // Data sesuai soal
        String jabatan = "Manajer";
        int p1 = 2000000; // Gaji Pokok
        int p2 = 300000;  // Tunjangan Jabatan
        int p3 = 200000;  // Tunjangan Istri
        int p4 = 150000;  // Tunjangan Anak

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.1 * p1 + p2 + p4;
        double gajiBersih = totalGaji - pajak;

        // Output
        System.out.println("\n===== Slip Gaji Pegawai =====");
        System.out.println("Nomor Induk Karyawan          : " + npm);
        System.out.println("Nama Karyawan                 : " + nama);
        System.out.println("Alamat                        : " + alamat);
        System.out.println("Jabatan                       : " + jabatan);
        System.out.println("Gaji Pokok                    : " + p1);
        System.out.println("Tunjangan Jabatan             : " + p2);
        System.out.println("Tunjangan Istri               : " + p3);
        System.out.println("Tunjangan Anak                : " + p4);
        System.out.println("Total Gaji                    : " + totalGaji);
        System.out.println("Pajak Penghasilan             : " + pajak);
        System.out.println("Gaji Bersih                   : " + gajiBersih);
    }
}