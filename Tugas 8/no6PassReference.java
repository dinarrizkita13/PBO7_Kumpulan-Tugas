
package tugaspertemuan8;
class Angka {
    int nilai;

    Angka(int nilai) {
        this.nilai = nilai;
    }

    int getNilai() {
        return this.nilai;
    }
}

public class no6PassReference {
    public static void main(String[] args) {
        Angka a = new Angka(10);

        System.out.println("Nilai di dalam objek: " + a.getNilai());
    }
}
