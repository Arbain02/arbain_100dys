
import java.util.Scanner;

public class DAY35_TASK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas bilangan ganjil: ");
        int jumlahBilangan = scanner.nextInt();

        int hasilJumlah = jumlahBilanganGanjil(jumlahBilangan);
        System.out.println("Hasil jumlah bilangan ganjil: " + hasilJumlah);

        scanner.close();
    }

    public static int jumlahBilanganGanjil(int jumlahBilangan) {
        int jumlah = 0;
        int bilanganGanjil = 1;

        for (int i = 0; i < jumlahBilangan; i++) {
            jumlah += bilanganGanjil;
            bilanganGanjil += 2;
        }

        return jumlah;
    }
}
