import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner agus=new Scanner(System.in);
        String KataAwal = agus.nextLine();
        String Bintang = "*";
        String Huruf = "e";
        System.out.println(KataAwal.replace(Huruf, Bintang));
    }
}