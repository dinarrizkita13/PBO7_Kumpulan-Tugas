public class Civitas {
    protected String nama;
    protected String unit; // fakultas / unit

    public Civitas(String nama, String unit) {
        this.nama = nama;
        this.unit = unit;
    }

    public void info() {
        System.out.println("Nama: " + nama + " | Unit: " + unit);
    }
}
