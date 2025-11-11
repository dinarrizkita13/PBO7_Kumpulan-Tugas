// NilaiMahasiswa.java
// Program memasukkan daftar mahasiswa (nama dan nilai) lalu menampilkan status Lulus/Tidak Lulus
import java.util.Scanner;

public class NilaiMahasiswa {
    static class Mahasiswa {
        String nama;
        int nilai;
        String status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int m = Math.max(0, sc.nextInt());
        sc.nextLine();

        Mahasiswa[] daftar = new Mahasiswa[m];
        for (int i = 0; i < m; i++) {
            daftar[i] = new Mahasiswa();
            System.out.print("Nama: ");
            daftar[i].nama = sc.nextLine();
            System.out.print("Nilai: ");
            daftar[i].nilai = sc.nextInt();
            sc.nextLine();
            daftar[i].status = daftar[i].nilai > 50 ? "Lulus" : "Tidak Lulus";
        }

        System.out.printf("%-4s %-20s %-6s %-12s%n", "No", "Nama", "Nilai", "Status");
        for (int i = 0; i < m; i++) {
            System.out.printf("%-4d %-20s %-6d %-12s%n", i + 1, daftar[i].nama, daftar[i].nilai, daftar[i].status);
        }
        sc.close();
    }
}
