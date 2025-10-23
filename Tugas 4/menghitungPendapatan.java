/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasp4;

import java.util.Scanner;

public class menghitungPendapatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        double penjualan = input.nextDouble();

        double jasa = 0;
        double komisi = 0;

        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = 0.10 * penjualan;
        } else if (penjualan > 2000000 && penjualan <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * penjualan;
        } else if (penjualan > 5000000) {
            jasa = 300000;
            komisi = 0.20 * penjualan;
        } else {
            System.out.println("Input tidak valid!");
        }

        double totalPendapatan = jasa + komisi;

        System.out.println("pendapatan");
        System.out.println("Total Penjualan   : Rp" + penjualan);
        System.out.println("Uang Jasa         : Rp" + jasa);
        System.out.println("Komisi Penjualan  : Rp" + komisi);
        System.out.println("-------------------------------------");
        System.out.println("Total Pendapatan  : Rp" + totalPendapatan);
    }
}
