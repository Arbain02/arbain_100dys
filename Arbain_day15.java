
package arbain_day15;
import java.util.Scanner;
public class Arbain_day15 {

    public static void main(String[] args) {
       int Nilai;
       Scanner masukkan=new
            Scanner(System.in);
        System.out.println("Nilai arbain:");
        Nilai=masukkan.nextInt();
        
        if(Nilai>=50){
            System.out.println("Anda lulus:");
            
          }else{ 
            System.out.println("Anda tidak lulus:");
        }
    }
    
}
