// UbahArray.java
// Mengubah elemen array yang berisi "Suzuki" lalu menampilkan indeks yang diubah
public class UbahArray {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        for (int i = 0; i < mobil.length; i++) {
            if ("Suzuki".equals(mobil[i])) {
                mobil[i] = "Suzuki Modified";
                System.out.println("Diubah indeks: " + i + " => " + mobil[i]);
            }
        }
        System.out.println(java.util.Arrays.toString(mobil));
    }
}
