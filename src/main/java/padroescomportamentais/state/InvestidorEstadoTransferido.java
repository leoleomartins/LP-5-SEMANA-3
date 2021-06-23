package padroescomportamentais.state;

public class InvestidorEstadoTransferido implements InvestidorEstado{

    private InvestidorEstadoTransferido() {};
    private static InvestidorEstadoTransferido instance = new InvestidorEstadoTransferido();
    public static InvestidorEstadoTransferido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Transferido";
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
