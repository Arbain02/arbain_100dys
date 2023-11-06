package arbain_day29_harga.barang;
 import java.util.Scanner;

public class Arbain_day29_hargaBarang {

    public static void main(String[] args) {

        // Deklarasikan variabel
        String namaBarang;
        int hargaBarang;
        int jumlahBeli;
        int totalHarga;
        float diskon;
        int totalBayar;

        // Membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama barang: ");
        namaBarang = input.nextLine();
        System.out.print("Masukkan harga barang: ");
        hargaBarang = input.nextInt();
        System.out.print("Masukkan jumlah beli: ");
        jumlahBeli = input.nextInt();

        // Menghitung total harga
        totalHarga = hargaBarang * jumlahBeli;

        // Menghitung diskon
        if (jumlahBeli >= 10) {
            diskon = 0.1f;
        } else {
            diskon = 0f;
        }

        // Menghitung total bayar
        totalBayar = (int) (totalHarga - (totalHarga * diskon));

        // Menampilkan output
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Harga barang: Rp" + hargaBarang);
        System.out.println("Jumlah beli: " + jumlahBeli);
        System.out.println("Total harga: Rp" + totalHarga);
        System.out.println("Diskon: " + diskon * 100 + "%");
        System.out.println("Total bayar: Rp" + totalBayar);
    }
}

   
