package pm_prova2_m;

abstract class Basico extends Aluguel implements Avaliavel
{
    public Basico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status)
    {
        super(nomeCliente,quantidadeDias,valorTotal,status);
    }
    @Override
    public abstract void avaliar(int nota);
    {
        System.out.println("Aluguel basico");
        System.out.println("Não possui seguro incluso");
    }

}
