public class Segitiga {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
