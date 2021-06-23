package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Estado investidor")
class InvestidorTest {

    Investidor investidor;

    @BeforeEach
    void setUp(){
        InvestidorBuilder investidorBuilder = new InvestidorBuilder();
        investidor = investidorBuilder
                .setCpf("101")
                .setNome("Leo")
                .build();
    }

    @Test
    @DisplayName("Não deve Ativar Investidor Ativo")
    void naoDeveAtivarInvestidorAtivo(){
        investidor.setInvestidorEstado(InvestidorEstadoAtivo.getInstance());
        assertEquals("Ativação não realizada", investidor.ativar());
    }

    @Test
    @DisplayName("Não deve Ativar Investidor Transferido")
    void naoDeveAtivarInvestidorTransferido(){
        investidor.setInvestidorEstado(InvestidorEstadoTransferido.getInstance());
        assertEquals("Ativação não realizada", investidor.ativar());
    }

    @Test
    @DisplayName("Deve Ativar Investidor Bloqueado")
    void deveAtivarInvestidorBloqueado(){
        investidor.setInvestidorEstado(InvestidorEstadoBloqueado.getInstance());
        assertEquals("Ativação realizada", investidor.ativar());
    }

    @Test
    @DisplayName("Não deve Ativar Investidor Excluido")
    void naoDeveAtivarInvestidorExcluido(){
        investidor.setInvestidorEstado(InvestidorEstadoExcluido.getInstance());
        assertEquals("Ativação não realizada", investidor.ativar());
    }

    @Test
    @DisplayName("Deve Transferir Investidor Ativo")
    void deveTransferirInvestidorAtivo(){
        investidor.setInvestidorEstado(InvestidorEstadoAtivo.getInstance());
        assertEquals("Transferencia realizada", investidor.transferir());
    }

    @Test
    @DisplayName("Nao Deve Transferir Investidor Bloqueado")
    void naoDeveTransferirInvestidorBloqueado(){
        investidor.setInvestidorEstado(InvestidorEstadoBloqueado.getInstance());
        assertEquals("Transferencia não realizada", investidor.transferir());
    }

    @Test
    @DisplayName("Nao Deve Transferir Investidor Excluido")
    void naoDeveTransferirInvestidorExcluido(){
        investidor.setInvestidorEstado(InvestidorEstadoExcluido.getInstance());
        assertEquals("Transferencia não realizada", investidor.transferir());
    }

    @Test
    @DisplayName("Nao Deve Transferir Investidor Transferido")
    void naoDeveTransferirInvestidorTransferido(){
        investidor.setInvestidorEstado(InvestidorEstadoTransferido.getInstance());
        assertEquals("Transferencia não realizada", investidor.transferir());
    }

    @Test
    @DisplayName("Nao Deve Bloquear Investidor Transferido")
    void naoDeveBloquearInvestidorTransferido(){
        investidor.setInvestidorEstado(InvestidorEstadoTransferido.getInstance());
        assertEquals("Bloqueio não realizado", investidor.bloquear());
    }

    @Test
    @DisplayName("Nao Deve Bloquear Investidor Excluido")
    void naoDeveBloquearInvestidorExcluido(){
        investidor.setInvestidorEstado(InvestidorEstadoExcluido.getInstance());
        assertEquals("Bloqueio não realizado", investidor.bloquear());
    }

    @Test
    @DisplayName("Nao Deve Bloquear Investidor Bloqueado")
    void naoDeveBloquearInvestidorBloqueado(){
        investidor.setInvestidorEstado(InvestidorEstadoBloqueado.getInstance());
        assertEquals("Bloqueio não realizado", investidor.bloquear());
    }

    @Test
    @DisplayName("Deve Bloquear Investidor Ativo")
    void deveBloquearInvestidorAtivo(){
        investidor.setInvestidorEstado(InvestidorEstadoAtivo.getInstance());
        assertEquals("Bloqueio realizado", investidor.bloquear());
    }

    @Test
    @DisplayName("Deve Excluir Investidor Ativo")
    void deveExcluirInvestidorAtivo(){
        investidor.setInvestidorEstado(InvestidorEstadoAtivo.getInstance());
        assertEquals("Exclusão realizada", investidor.excluir());
    }

    @Test
    @DisplayName("Deve Excluir Investidor Bloqueado")
    void deveExcluirInvestidorBloqueado(){
        investidor.setInvestidorEstado(InvestidorEstadoBloqueado.getInstance());
        assertEquals("Exclusão realizada", investidor.excluir());
    }

    @Test
    @DisplayName("Não Deve Excluir Investidor Transferido")
    void deveExcluirInvestidorTransferido(){
        investidor.setInvestidorEstado(InvestidorEstadoTransferido.getInstance());
        assertEquals("Exclusão não realizada", investidor.excluir());
    }

    @Test
    @DisplayName("Não Deve Excluir Investidor Excluido")
    void deveExcluirInvestidorExcluido(){
        investidor.setInvestidorEstado(InvestidorEstadoExcluido.getInstance());
        assertEquals("Exclusão não realizada", investidor.excluir());
    }

}
