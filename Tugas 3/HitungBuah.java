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
public class HitungBuah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Total Buah Ibu Sisca ===");

        System.out.print("Masukkan jumlah mangga yang dibeli: ");
        int mangga = input.nextInt();

        System.out.print("Masukkan jumlah tetangga: ");
        int tetangga = input.nextInt();

        System.out.print("Masukkan jumlah jambu per tetangga: ");
        int jambuPerTetangga = input.nextInt();

        System.out.print("Masukkan jumlah mangga busuk: ");
        int manggaBusuk = input.nextInt();

        int totalJambu = tetangga * jambuPerTetangga;
        int manggaBaik = mangga - manggaBusuk;
        int totalBuah = totalJambu + manggaBaik;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total Jambu Dibeli   : " + totalJambu + " pcs");
        System.out.println("Total Mangga Baik    : " + manggaBaik + " pcs");
        System.out.println("Total Buah Keseluruhan: " + totalBuah + " pcs");
    }
}

            



