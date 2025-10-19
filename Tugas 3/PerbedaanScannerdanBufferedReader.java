//Penjelasan Singkat:
//Scanner lebih mudah digunakan, bisa langsung membaca tipe data (int, double, string).
//BufferedReader lebih cepat untuk input besar, tapi hanya membaca String, jadi perlu konversi manual ke int atau double.

package pbo1;


import java.util.Scanner;
import java.io.*;


public class PerbedaanScannerdanBufferedReader {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input menggunakan Scanner (nama): ");
        String nama1 = sc.nextLine();

        System.out.print("Input menggunakan BufferedReader (nama): ");
        String nama2 = br.readLine();

        System.out.println("\n--- Hasil ---");
        System.out.println("Scanner membaca: " + nama1);
        System.out.println("BufferedReader membaca: " + nama2);
    }
}

