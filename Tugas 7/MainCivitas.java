public class MainCivitas {
    public static void main(String[] args) {
        Dosen d = new Dosen("Dr. Budi", "Teknik", "NIDN1234");
        Mahasiswa m = new Mahasiswa("Sinta", "Teknik", "5520123456", "IF-C");
        Staff s = new Staff("Maya", "Teknik", "Administrasi");

        d.info();
        m.info();
        s.info();
    }
}
