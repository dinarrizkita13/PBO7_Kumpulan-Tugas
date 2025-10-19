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
public class CetakNovel {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah novel yang akan dicetak: ");
        int jumlahNovel = input.nextInt();

        System.out.print("Masukkan tebal novel (lembar): ");
        int tebalNovel = input.nextInt();

        int totalLembar = jumlahNovel * tebalNovel;
        int totalDetik = totalLembar; // karena 1 lembar/detik

        int hari = totalDetik / 86400;
        int sisaHari = totalDetik % 86400;
        int jam = sisaHari / 3600;
        int sisaJam = sisaHari % 3600;
        int menit = sisaJam / 60;
        int detik = sisaJam % 60;

        System.out.println("\nTotal waktu yang dibutuhkan:");
        System.out.println(hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}


