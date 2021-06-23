package padroescomportamentais.state;

public class InvestidorEstadoBloqueado implements InvestidorEstado{

    private InvestidorEstadoBloqueado() {};
    private static InvestidorEstadoBloqueado instance = new InvestidorEstadoBloqueado();
    public static InvestidorEstadoBloqueado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Bloqueado";
    }

    @Override
    public String ativar(Investidor investidor) {
        return "Ativação realizada";
    }

    @Override
    public String transferir(Investidor investidor) {
        return "Transferencia não realizada";
    }

    @Override
    public String bloquear(Investidor investidor) {
        return "Bloqueio não realizado";
    }

    @Override
    public String excluir(Investidor investidor) {
        return "Exclusão realizada";
    }
}
