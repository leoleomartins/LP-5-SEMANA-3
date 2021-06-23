package padroescomportamentais.state;

public class Investidor {

    private InvestidorEstado investidorEstado;
    private String nome;
    private String sobrenome;
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private String cpf;
    private Double valorInvestido;

    public Investidor() {
        this.investidorEstado = InvestidorEstadoAtivo.getInstance();
        this.cpf="";
        this.nome="";
    }

    public InvestidorEstado getInvestidorEstado() {
        return investidorEstado;
    }

    public void setInvestidorEstado(InvestidorEstado investidorEstado) {
        this.investidorEstado = investidorEstado;
    }

    public String ativar(){return investidorEstado.ativar(this);}
    public String bloquear(){return investidorEstado.bloquear(this);}
    public String transferir(){return investidorEstado.transferir(this);}
    public String excluir(){return investidorEstado.excluir(this);}





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }
}
