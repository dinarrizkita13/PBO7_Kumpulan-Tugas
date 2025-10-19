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
public class Pembelanjaan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Pembelanjaan ===");
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Total Belanja: ");
        double totalBelanja = input.nextDouble();

        System.out.print("Masukkan Diskon (%): ");
        double diskon = input.nextDouble();

        double potongan = (diskon / 100) * totalBelanja;
        double totalBayar = totalBelanja - potongan;

        System.out.print("Masukkan Uang Bayar: ");
        double bayar = input.nextDouble();

        double kembalian = bayar - totalBayar;

        System.out.println("\n=== STRUK PEMBELANJAAN ===");
        System.out.println("Nama Pembeli   : " + nama);
        System.out.println("Total Belanja  : Rp" + totalBelanja);
        System.out.println("Diskon         : " + diskon + "%");
        System.out.println("Total Bayar    : Rp" + totalBayar);
        System.out.println("Bayar          : Rp" + bayar);
        System.out.println("Kembalian      : Rp" + kembalian);
    }
}

