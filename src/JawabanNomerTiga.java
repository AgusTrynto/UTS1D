import java.util.Scanner;

public class JawabanNomerTiga {
    public class check {
        static int jumlahPlat = 10;
        static int Kudus = 8;
        static int Jakarta = 8;
        static int Jogja = 0;
        static int Karawang = 8;
        static int Solo = 0;
        static int sisakuota = 0;
        static boolean success = false;

        String[] InfoPlat = new String[]{"K-Kudus", "B-Jakarta", "AB-Jogia", "T-Karawang", "AD-Solo"};

        public static void main(String[] args) {

            String[] InfoPlat = new String[]{"K-Kudus", "B-Jakarta", "AB-Jogja", "T-Karawang", "AD-Solo"};
            for (int i = 0; i <= 8; 1++) {
                plat();
            }
        }

        public static void cekPlatNomor(String kodePlat) {
            if (kodePlat.contains("K")) {
                success = true;
                Kudus++;
            } else if (kodePlat.contains("B")) {
                success = true;
                Jakarta++;
            } else if (kodePlat.contains("AB")) {
                success = true;
                Jogja++;
            } else if (kodePlat.contains("T")) {
                success = true;
                Karawang++;
            } else if (kodePlat.contains("AD")) {
                success = true;
                Solo++;
            } else {
                success = false;
                System.out.println("kode yang anda isi tidak valid");
            }
        }

        static void plat() {
            Scanner inputData = new Scanner(System.in);
            System.out.println("masukkan plat nomor");
            String plat = inputData.nextLine();
        }
    }

    public static void main(String[] args) {
        while (true) {
            check.plat();
        }
    }
}

