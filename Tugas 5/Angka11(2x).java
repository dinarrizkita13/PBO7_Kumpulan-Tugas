public class No6_ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 11) { // tidak akan masuk karena batas 10
                System.out.println(i);
            }
        }

        // Cara benar untuk menampilkan angka 11 dua kali:
        for (int i = 0; i <= 11; i++) {
            System.out.println(i);
            if (i == 11) {
                System.out.println(i); // tampil 2 kali
            }
        }
    }
}