package npm07048soalpendahuluan1_7;

class lingkaran
{
    double pi = 3.14;
    double diameter;
    
    public lingkaran ( double d )
    {
        this.diameter = d;
    }
    
    void keliling ()
    {
        double keliling = diameter*pi;
        System.out.println("Keliling Lingkaran = " + keliling);
    }
    
    double luas ()
    {
        double luas = diameter/2*pi*pi;
        return luas;
    }
}

public class NPM07048soalPendahuluan1_7 {
    
    public static void main(String[] args) 
    {
        double diameter = 10;
        lingkaran bulet = new lingkaran (diameter);
        bulet.keliling();
        double Luas = bulet.luas();
        System.out.println("Luas Lingkaran = " + Luas);
    }
    
}
