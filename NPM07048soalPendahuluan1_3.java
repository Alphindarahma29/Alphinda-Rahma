package npm07048soalpendahuluan1_3;
import java.util.Scanner;

public class NPM07048soalPendahuluan1_3 
{

    public static void main(String[] args) 
    {
        double pi = 3.14;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Diameter = ");
        int diameter = input.nextInt();
        System.out.print("Masukkan Tinggi = ");
        int tinggi = input.nextInt();
        
        double volume = diameter/2*pi*pi*tinggi;
        System.out.println("Volume Tabung = " + volume);
    }
    
}
