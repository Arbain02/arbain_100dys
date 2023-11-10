
import java.util.Scanner;

public class Day33_ifelse {

    public static void main(String[] args) {
        System.out.print("Masukkan jam: ");
        Scanner sc = new Scanner(System.in);
        double jam = sc.nextDouble();

        if (jam >= 05.00 && jam <= 10.00) {
            System.out.println("Pagi");
        } else if (jam >= 11.00 && jam <= 13.00) {
            System.out.println("Siang");
        } else if (jam >= 14.00 && jam <= 18.00) {
            System.out.println("Sore");
        } else if (jam >= 19.00 && jam <= 24.00) {
            System.out.println("Malam");
        } else if (jam >= 01.00 && jam <= 04.59) {
            System.out.println("Dini hari");
        } else {
            System.out.println("false");
        }

    }
}

