package padroescomportamentais.state;

public interface InvestidorEstado {
    String getEstado();
    String ativar(Investidor investidor);
    String transferir(Investidor investidor);
    String bloquear(Investidor investidor);
    String excluir(Investidor investidor);
}
