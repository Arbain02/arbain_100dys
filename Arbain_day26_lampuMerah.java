package arbain_day26_lampu.merah;
import java.util.Scanner;
public class Arbain_day26_lampuMerah {

    public static void main(String[] args) {

        // Deklarasi variabel
        String warnaLampu = "Merah";
        int waktuLampu = 30;

        // Menampilkan warna lampu awal
        System.out.println("Warna lampu sekarang: " + warnaLampu);

        // Melakukan perulangan untuk mengganti warna lampu
        for (int i = 1; i <= 3; i++) {
            // Menunggu waktu lampu
            try {
                Thread.sleep(waktuLampu * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Mengganti warna lampu
            if (warnaLampu.equals("Merah")) {
                warnaLampu = "Kuning";
            } else if (warnaLampu.equals("Kuning")) {
                warnaLampu = "Hijau";
            } else {
                warnaLampu = "Merah";
            }

            // Menampilkan warna lampu
            System.out.println("Warna lampu sekarang: " + warnaLampu);
        }
    }
}

    
    

