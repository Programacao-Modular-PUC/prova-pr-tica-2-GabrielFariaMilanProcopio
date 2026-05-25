package pm_prova2_m;

abstract class Executivo extends Aluguel implements Avaliavel
{
    public Executivo(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status)
    {
        super(nomeCliente,quantidadeDias,valorTotal,status);
    }
    @Override
    public abstract void avaliar(int nota);
    {
        System.out.println("Aluguel executivo");
    }
}
