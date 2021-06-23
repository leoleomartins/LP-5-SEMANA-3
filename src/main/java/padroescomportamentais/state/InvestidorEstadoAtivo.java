package padroescomportamentais.state;

public class InvestidorEstadoAtivo implements InvestidorEstado {

    private InvestidorEstadoAtivo() {};
    private static InvestidorEstadoAtivo instance = new InvestidorEstadoAtivo();
    public static InvestidorEstadoAtivo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Ativo";
    }

    @Override
    public String ativar(Investidor investidor) {
        return "Ativação não realizada";
    }

    @Override
    public String transferir(Investidor investidor) {
        return "Transferencia realizada";
    }

    @Override
    public String bloquear(Investidor investidor) {
        return "Bloqueio realizado";
    }

    @Override
    public String excluir(Investidor investidor) {
        return "Exclusão realizada";
    }
}
