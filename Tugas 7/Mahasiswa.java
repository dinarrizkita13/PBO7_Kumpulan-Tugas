public class Mahasiswa extends Civitas {
    private String npm;
    private String kelas;

    public Mahasiswa(String nama, String unit, String npm, String kelas) {
        super(nama, unit);
        this.npm = npm;
        this.kelas = kelas;
    }

    @Override
    public void info() {
        System.out.println("Mahasiswa - Nama: " + nama + " | NPM: " + npm + " | Kelas: " + kelas);
    }
}
