// ContohThread.java
// Contoh penggunaan Thread dengan kelas turunan Thread
class Pekerja extends Thread {
    private String nama;

    Pekerja(String nama) {
        this.nama = nama;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nama + " sedang bekerja (" + i + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(nama + " terhenti: " + e.getMessage());
            }
        }
        System.out.println(nama + " selesai.");
    }
}

public class ContohThread {
    public static void main(String[] args) {
        Pekerja t1 = new Pekerja("Thread 1");
        Pekerja t2 = new Pekerja("Thread 2");
        Pekerja t3 = new Pekerja("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
