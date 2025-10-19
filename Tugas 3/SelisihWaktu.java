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
public class SelisihWaktu {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam pertama: ");
        int jam1 = input.nextInt();
        System.out.print("Masukkan menit pertama: ");
        int menit1 = input.nextInt();

        System.out.print("Masukkan jam kedua: ");
        int jam2 = input.nextInt();
        System.out.print("Masukkan menit kedua: ");
        int menit2 = input.nextInt();

        int total1 = jam1 * 60 + menit1;
        int total2 = jam2 * 60 + menit2;

        int selisih = Math.abs(total2 - total1);

        int jamSelisih = selisih / 60;
        int menitSelisih = selisih % 60;

        System.out.println("Selisih waktu = " + jamSelisih + " jam " + menitSelisih + " menit");
    }
}
