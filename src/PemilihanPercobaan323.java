import java.util.Scanner;
public class PemilihanPercobaan323 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        double angka1 ,angka2, hasil;
        char operator;  

        System.out.println("Masukkan angka pertama : ");
        angka1 = input23.nextInt();
        System.out.println("Masukkan angka kedua : ");
        angka2 = input23.nextInt();
        System.out.println("Masukkan operator (+ - * /): ");
        operator = input23.next().charAt(0);
        input23.close();
        switch (operator) {
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + "+" +  angka2 + "=" + hasil);
            break;
             case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + "-" +  angka2 + "=" + hasil);
            break;
             case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + "*" +  angka2 + "=" + hasil);
            break;
             case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + "+" +  angka2 + "=" + hasil);
            break;
        }
    }

    
}
