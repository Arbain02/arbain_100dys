package arbain_day27_konversi.suhu;
  import java.util.Scanner;
public class Arbain_day27_konversiSuhu {

    public static void main(String[] args) {
   
        // Deklarasi variabel
        Scanner input = new Scanner(System.in);
        int pilihan;
        double suhu, hasil;

        // Menu
        System.out.println("Konversi Suhu");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.println("7. Celsius to Reamur");
        System.out.println("8. Reamur to Celsius");
        System.out.println("9. Reamur to Fahrenheit");
        System.out.println("10. Fahrenheit to Reamur");
        System.out.println("11. Kelvin to Reamur");
        System.out.println("12. Reamur to Kelvin");
        System.out.print("Pilih konversi: ");
        pilihan = input.nextInt();

        // Input suhu
        System.out.print("Masukkan suhu: ");
        suhu = input.nextDouble();

        // Konversi suhu
        switch (pilihan) {
            case 1:
                hasil = suhu * 9/5 + 32;
                System.out.println("Hasil: " + hasil + " Fahrenheit");
                break;
            case 2:
                hasil = (suhu - 32) * 5/9;
                System.out.println("Hasil: " + hasil + " Celsius");
                break;
            case 3:
                hasil = suhu + 273.15;
                System.out.println("Hasil: " + hasil + " Kelvin");
                break;
            case 4:
                hasil = suhu - 273.15;
                System.out.println("Hasil: " + hasil + " Celsius");
                break;
            case 5:
                hasil = (suhu - 32) * 5/9 + 273.15;
                System.out.println("Hasil: " + hasil + " Kelvin");
                break;
            case 6:
                hasil = (suhu - 273.15) * 9/5 + 32;
                System.out.println("Hasil: " + hasil + " Fahrenheit");
                break;
            case 7:
                hasil = suhu * 4/5;
                System.out.println("Hasil: " + hasil + " Reamur");
                break;
            case 8:
                hasil = suhu / 4;
                System.out.println("Hasil: " + hasil + " Celsius");
                break;
            case 9:
                hasil = (suhu * 9/4) + 32;
                System.out.println("Hasil: " + hasil + " Fahrenheit");
                break;
            case 10:
                hasil = (suhu - 32) * 4/9;
                System.out.println("Hasil: " + hasil + " Reamur");
                break;
            case 11:
                hasil = suhu / 5 + 273.15;
                System.out.println("Hasil: " + hasil + " Kelvin");
                break;
            case 12:
                hasil = suhu - 273.15 / 5;
                System.out.println("Hasil: " + hasil + " Fahrenheit");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}

    
    

