
package tugaspertemuan8;


import java.util.Scanner;

public class no3Biner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan desimal: ");
        int desimal = input.nextInt();

        String biner = Integer.toBinaryString(desimal);

        System.out.println("Bilangan biner = " + biner);
    }
}

