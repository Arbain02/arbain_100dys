
package arbain_day22_bilangan.and.genap;

public class Arbain_day22_bilanganAndGenap {

        public static void main(String[] args) {
          
        // Deklarasikan variabel bilangan
        int bilangan;

        // Input nilai bilangan
        System.out.print("Masukkan bilangan: ");
        bilangan = Integer.parseInt(System.console().readLine());

        // Periksa apakah bilangan ganjil atau genap
        int hasil = bilangan % 2 == 1 ? bilangan + 1 : bilangan + 2;

        // Tampilkan hasil
        System.out.println("Hasil: " + hasil);
    }
}




    
   
    

