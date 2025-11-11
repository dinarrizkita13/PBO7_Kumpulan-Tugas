// ContohRunnable.java
// Contoh penggunaan Runnable untuk membuat task yang bisa dijalankan oleh Thread
class TugasCetak implements Runnable {
    private String namaTugas;

    TugasCetak(String nama) {
        this.namaTugas = nama;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(namaTugas + " mencetak baris ke-" + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(namaTugas + " dihentikan.");
            }
        }
        System.out.println(namaTugas + " selesai mencetak.");
    }
}

public class ContohRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TugasCetak("Tugas 1"));
        Thread t2 = new Thread(new TugasCetak("Tugas 2"));

        t1.start();
        t2.start();
    }
}
