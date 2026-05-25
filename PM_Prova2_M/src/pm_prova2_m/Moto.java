package pm_prova2_m;

abstract class Moto extends Veiculo implements Inspecionavel
{
    public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria,double quilometragem, StatusVeiculo status)
    {
        super(placa,modelo,anoFabricacao,valorDiaria,quilometragem,status);
    }
    @Override
    public abstract void realizarInspecao();
    {
        System.out.println("Moto");
    }

}
