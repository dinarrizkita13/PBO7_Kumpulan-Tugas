// VariasiArray.java
// Contoh tiga variasi sintaks untuk membuat array bertipe integer
public class VariasiArray {
    public static void main(String[] args) {
        int[] a1 = new int[5];
        int[] a2 = {1, 2, 3, 4, 5};
        int[] a3;
        a3 = new int[]{10, 20, 30};

        System.out.println(java.util.Arrays.toString(a1));
        System.out.println(java.util.Arrays.toString(a2));
        System.out.println(java.util.Arrays.toString(a3));
    }
}
