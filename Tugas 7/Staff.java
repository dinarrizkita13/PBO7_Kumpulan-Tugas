public class Staff extends Civitas {
    private String jabatan;

    public Staff(String nama, String unit, String jabatan) {
        super(nama, unit);
        this.jabatan = jabatan;
    }

    @Override
    public void info() {
        System.out.println("Staff - Nama: " + nama + " | Jabatan: " + jabatan + " | Unit: " + unit);
    }
}
