package padroescomportamentais.state;

public class InvestidorEstadoExcluido implements InvestidorEstado{

    private InvestidorEstadoExcluido() {};
    private static InvestidorEstadoExcluido instance = new InvestidorEstadoExcluido();
    public static InvestidorEstadoExcluido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Excluido";
    }

    @Override
    public String ativar(Investidor investidor) {
        return "Ativação não realizada";
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
        return "Exclusão não realizada";
    }
}
