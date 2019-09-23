package npm07048soalpendahuluan1_6;
import java.util.Scanner;

public class NPM07048soalPendahuluan1_6 
{
    static void menu ()
    {
        System.out.println("====================================");
        System.out.println("1. Procedure Luas Lingkaran ");
        System.out.println("2. Fungsi Luas Lingkaran ");
        System.out.println("3. Fungsi Bangun Lingkaran ");
        System.out.println("4. Fungsi Bangun Tabung ");
    }
    
        static void ProcedureLuasLingkaran ( double diameter )
        {
            double jari = diameter/2;
            double luas = jari*3.14*3.14;
            System.out.println( "Luas Lingkaran = " + luas );
        }
        
        static double FungsiLuasLingkaran ( double diameter )
        {
            double jari = diameter/2;
            double luas = jari*3.14*3.14;
            return luas;
        }
        
        static double[] FungsiLingkaran ( double diameter )
        {
            double[] hasil = new double [2];
            double jari = diameter/2;
            double luas = jari*3.14*3.14;
            double keliling = jari*2*3.14;
            hasil[0] = luas;
            hasil[1] = keliling;
            return hasil;
        }
        
        static double FungsiTabung ( double d, int t )
        {
            double jari = d/2;
            double luas = jari*3.14*3.14;
            double volume = luas*t;
            return volume;
        }

    public static void main(String[] args) 
    {
        for (String b = "Y"; b.equals("y") || b.equals("Y");)
        {
        Scanner ulang = new Scanner (System.in);
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Diameter ( meter ) : ");
        double diameter = input.nextDouble();
        
        menu();
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        
        switch ( pilihan )
        {
            case 1 :
                ProcedureLuasLingkaran(diameter);
                System.out.println();
                break;
                
            case 2 :
                double luas = FungsiLuasLingkaran(diameter);
                System.out.println("Luas Lingkaran = " +luas);
                System.out.println();
                break;
                
            case 3 :
                double[] hasil = FungsiLingkaran(diameter);
                System.out.println("Luas Lingkaran = " +hasil[0]);
                System.out.println("Keliling Lingkaran = " +hasil[1]);
                System.out.println();
                break;
                
            case 4 :
                System.out.print("Masukkan Tinggi (m) = ");
                int tinggi = input.nextInt();
                double volume = FungsiTabung(diameter, tinggi);
                double konversi = volume*100;
                System.out.println("Volume Tabung = " +konversi+ " cm^3 ");
                System.out.println();
                break;
        }
        System.out.print("Ulang ? ");
        b =ulang.next();
        System.out.println();
        }
    }
    
}
