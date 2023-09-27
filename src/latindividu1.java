import java.util.Scanner;

public class latindividu1 {
    public static void main(String[] args) {
        int jarak;
        String senjata;
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan jarak :");
        jarak = sc.nextInt();

        if (jarak <=5 && jarak > 0) {
            senjata = "melee weapon";
        }
        else {
            senjata = "ranged weapon";
        }
        System.out.print("mending antum pake " + senjata);
        sc.close();
    }
}
