package arbain_day25_matriks;
  import java.util.Scanner;
public class Arbain_day25_matriks {
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);

        // Masukan ordo matriks
        System.out.print("Masukan ordo matriks: ");
        int ordo = input.nextInt();

        // Inisialisasi matriks
        int[][] matriks1 = new int[ordo][ordo];
        int[][] matriks2 = new int[ordo][ordo];

        // Masukan elemen matriks 1
        System.out.println("Masukan elemen matriks 1: ");
        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                matriks1[i][j] = input.nextInt();
            }
        }

        // Masukan elemen matriks 2
        System.out.println("Masukan elemen matriks 2: ");
        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                matriks2[i][j] = input.nextInt();
            }
        }

        // Penjumlahan matriks
        int[][] matriks3 = new int[ordo][ordo];
        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                matriks3[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        // Cetak matriks hasil penjumlahan
        System.out.println("Matriks hasil penjumlahan: ");
        for (int i = 0; i < ordo; i++) {
            for (int j = 0; j < ordo; j++) {
                System.out.print(matriks3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    

