package npm07048soalpendahuluan1_8;

class lingkaran
{
    double pi = 3.14;
    double diameter;
    
    void setDiameter ( double d )
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

public class NPM07048soalPendahuluan1_8 
{

    public static void main(String[] args)
    {
        lingkaran bulet = new lingkaran();
        double diameter = 10;
        bulet.setDiameter(diameter);
        bulet.keliling();
        double LUAS;
        LUAS = bulet.luas();
        System.out.println("Luas Lingkaran = " + LUAS);
    }
    
}
