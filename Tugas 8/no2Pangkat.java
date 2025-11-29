
package tugaspertemuan8;


import java.util.Scanner;

public class no2Pangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bilangan: ");
        int bil = input.nextInt();

        System.out.print("Pangkat: ");
        int pangkat = input.nextInt();

        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil *= bil;
        }

        System.out.println("Hasil = " + hasil);
    }
}
