package pm_prova2_m;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Avaliavel> avalia = new ArrayList<>();
        ArrayList<Inspecionavel> inspeciona = new ArrayList<>();
        
        avalia.add(new Carro("Carro"));
        inspeciona.add(new Moto("Moto"));
        avalia.add(new Van("Van"));
        avalia.add(new Basico ("Basico"));
        
        
        
        for(Avaliavel a:avalia)
        {
            ((Avaliavel)a.)avalia();
        }
    }
    
}
