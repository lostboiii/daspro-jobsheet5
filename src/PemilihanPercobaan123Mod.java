import java.util.Scanner;

public class PemilihanPercobaan123Mod {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

         System.out.println("Masukkan angka: ");
        int angka = input23.nextInt();

        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka "+ angka + " bilangan "+ hasil);
        input23.close();
    }
}
