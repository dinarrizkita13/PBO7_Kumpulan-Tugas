public class Dosen extends Civitas {
    private String nidn;

    public Dosen(String nama, String unit, String nidn) {
        super(nama, unit);
        this.nidn = nidn;
    }

    @Override
    public void info() {
        System.out.println("Dosen - Nama: " + nama + " | NIDN: " + nidn + " | Unit: " + unit);
    }
}
