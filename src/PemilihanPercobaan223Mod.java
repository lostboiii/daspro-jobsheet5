import java.util.Scanner;

public class PemilihanPercobaan223Mod {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.println("Nilai uas       : ");
        float uas = input23.nextFloat();
        System.out.println("Nilai uts       : ");
        float uts = input23.nextFloat();
        System.out.println("Nilai kuis       : ");
        float kuis = input23.nextFloat();
        System.out.println("Nilai tugas       : ");
        float tugas = input23.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
         String grade;
        if (80<total && total<= 100) {
            grade = "A";
        }
        else if (73<total && total<= 80) {
             grade ="B+";
        }
        else if (65<total && total<=73){
             grade = "B";
        }
        else if (60<total && total<=65){
            grade = "C+";
        }
        else if (50<total && total<=60){
             grade = "C";
        }
        else if (39<total && total<=50){
             grade = "D";
        }
        else{
            grade = "E";
        }
        input23.close();
System.out.println("Nilai akhir ="+ total + " atau " + grade + " sehingga " + message);
    }
        
       
}
