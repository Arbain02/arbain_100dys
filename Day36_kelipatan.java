
package day36_kelipatan;

public class Day36_kelipatan {


    public static void main(String[] args) {
       
        // Membaca input dari pengguna
        int n = Integer.parseInt(System.console().readLine());
        int m = Integer.parseInt(System.console().readLine());

        // Mencetak kelipatan n dari 1 hingga m
        for (int i = 1; i <= m; i++) {
            System.out.println(n * i);
        }
    }
}

    
    

