import java.util.Scanner;

public class DataMahasiswa {
    private String nama;
    private String npm;
    private String kelas;

    public DataMahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public void tampilkan() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NPM  : " + this.npm);
        System.out.println("Kelas: " + this.kelas);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama  : "); String nama = sc.nextLine();
        System.out.print("NPM   : "); String npm = sc.nextLine();
        System.out.print("Kelas : "); String kelas = sc.nextLine();
        DataMahasiswa dm = new DataMahasiswa(nama, npm, kelas);
        dm.tampilkan();
        sc.close();
    }
}
