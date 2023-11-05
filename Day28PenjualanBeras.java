
package day28.penjualan.beras;


public class Day28PenjualanBeras {

   
    public static void main(String[] args) {
       
        // Harga beras per karung
        int hargaBeras = 500000;

        // Input jumlah beras yang dibeli
        System.out.print("Masukkan jumlah beras yang dibeli: ");
        int jumlahBeras = Integer.parseInt(System.console().readLine());

        // Hitung harga beras sebelum diskon
        int totalHargaBeras = hargaBeras * jumlahBeras;

        // Hitung diskon
        int potongan = 0;
        if (jumlahBeras >= 150) {
            potongan = 3;
        } else if (jumlahBeras >= 300) {
            potongan = 7;
        }

        // Hitung harga beras setelah diskon
        int hargaBersih = totalHargaBeras - (totalHargaBeras * potongan / 100);

        // Tampilkan output
        if (potongan > 0) {
            System.out.println("Anda mendapatkan diskon " + potongan + "%, harga yang harus Anda bayar adalah " + hargaBersih);
        } else {
            System.out.println("Anda tidak mendapatkan diskon, harga yang harus Anda bayar adalah " + totalHargaBeras);
        }
    }
}

        
    
    

