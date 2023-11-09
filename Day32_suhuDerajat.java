package day32_suhu.derajat;
import java.util.Scanner;
public class Day32_suhuDerajat {

    public static void main(String[] args) {
        
        // Deklarasi variabel
        int suhuCelcius;
        int suhuFahrenheit;

        // Membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celcius: ");
        suhuCelcius = input.nextInt();

        // Mengkonversi suhu dari Celcius ke Fahrenheit
        suhuFahrenheit = (suhuCelcius * 9/5) + 32;

        // Menampilkan hasil konversi
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
    }
}

    
    

