import java.util.Scanner;

public class latindividu2 {
    
    public static void main(String[] args) {
        int usernameril = 1234, user;
        int passwordril = 1234, pass;
       Scanner sc = new Scanner(System.in);
       System.out.println("Masukkan Username : ");  
       user = sc.nextInt();
       System.out.println("Masukkan Password : ");
       pass = sc.nextInt();
       if (user == usernameril && pass == passwordril) {
        System.out.println("Berhasil login masbro");
       }
       else{
        System.out.println("salah awogowgwogowo");
       }
       sc.close();
    }
}
