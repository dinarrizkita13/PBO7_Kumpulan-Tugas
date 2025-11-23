// Penjelasan singkat: kelas adalah cetak biru (atribut + method). Membuat objek = meng-instantiate kelas dengan keyword new. Objek menyimpan data spesifik dan dapat memanggil method kelas.


public class ContohKelasObjek {
    // kelas Person (cetakan)
    static class Person {
        String nama;
        int umur;

        Person(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }

        void sapa() {
            System.out.println("Halo, saya " + nama + ", umur " + umur + " tahun.");
        }
    }

    public static void main(String[] args) {
        // membuat objek dari kelas Person
        Person p1 = new Person("Andi", 20);  // instansiasi -> objek
        Person p2 = new Person("Sari", 22);
        p1.sapa();
        p2.sapa();
    }
}
