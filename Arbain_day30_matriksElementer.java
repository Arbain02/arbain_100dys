package arbain_day30_matriks.elementer;
import java.util.Scanner;
public class Arbain_day30_matriksElementer {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Masukan ukuran matriks
        int baris, kolom;
        System.out.print("Masukkan jumlah baris: ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = input.nextInt();

        // Inisialisasi matriks
        int[][] matriks = new int[baris][kolom];

        // Masukan nilai matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan nilai matriks [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        // Menampilkan matriks
        System.out.println("Matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        // Menghitung jumlah elemen genap
        int jumlahElemenGenap = 0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (matriks[i][j] % 2 == 0) {
                    jumlahElemenGenap++;
                }
            }
        }

        // Menampilkan jumlah elemen genap
        System.out.println("Jumlah elemen genap: " + jumlahElemenGenap);
    }
}

    
    

