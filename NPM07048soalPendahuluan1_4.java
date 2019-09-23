package npm07048soalpendahuluan1_4;
import java.util.Scanner;

public class NPM07048soalPendahuluan1_4 
{

    public static void main(String[] args)
    {
        for (String b = "Y"; b.equals("y") || b.equals("Y");)
        {
            Scanner ulang = new Scanner (System.in);
            Scanner input = new Scanner (System.in);
            System.out.print("Masukkan Umur = ");
            int umur = input.nextInt();
        
        {
            if ( umur>=0 && umur<=5 )
            {
                System.out.println("BALITA");
            }
            else if ( umur>=6 && umur<=17 )
            {
                System.out.println("ANAK-ANAK");
            }
            else if ( umur>=18 && umur<=50 )
            {
                System.out.println("DEWASA");
            }
            else if ( umur>50 )
            {
                System.out.println("TUA");
            }
        }
        
          System.out.println("Ulang ? ");
          b =ulang.next();
        
        }
    }
}