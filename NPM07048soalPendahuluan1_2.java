package npm07048soalpendahuluan1_2;
import java.util.Scanner;

public class NPM07048soalPendahuluan1_2 
{
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan diameter lingkaran = ");
        int diameter = input.nextInt();
        double pi = 3.14;
        double luas = diameter/2*pi*pi;
        System.out.println("Luas Lingkaran = " + luas);
    }
    
}
