package pm_prova2_m;

abstract class Carro extends Veiculo implements Avaliavel
{
    public Carro(String placa,String modelo,int anoFabricacao,double valorDiaria,double quilometragem,StatusVeiculo status)
    {
        super(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status);
    }
   @Override
   public abstract void avaliar(int nota);
   {
       System.out.println("Carro");
   }
}
