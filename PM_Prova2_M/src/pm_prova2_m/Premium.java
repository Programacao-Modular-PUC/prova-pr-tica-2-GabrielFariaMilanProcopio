package pm_prova2_m;

abstract class Premium extends Aluguel implements Avaliavel
{
    public Premium(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status)
    {
        super(nomeCliente,quantidadeDias,valorTotal,status);
    }
    @Override
    public abstract boolean possuiSeguroIncluso();
    {
        System.out.println("Aluguel premium");
        System.out.println("Possui seguro incluso");
    }

}
