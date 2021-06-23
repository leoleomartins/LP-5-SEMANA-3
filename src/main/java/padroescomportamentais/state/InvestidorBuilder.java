package padroescomportamentais.state;

public class InvestidorBuilder {

    private Investidor investidor;

    public InvestidorBuilder(){
        investidor = new Investidor();
    }

    public Investidor build() {
        if (investidor.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (investidor.getCpf().equals("")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        return investidor;
    }
        public InvestidorBuilder setNome(String nome) {
            investidor.setNome(nome);
            return this;
        }

        public InvestidorBuilder setSobrenome(String sobrenome) {
            investidor.setSobrenome(sobrenome);
            return this;
        }

        public InvestidorBuilder setRua(String rua) {
            investidor.setRua(rua);
            return this;
        }

        public InvestidorBuilder setNumero(String numero) {
            investidor.setNumero(numero);
            return this;
        }

        public InvestidorBuilder setCep(String cep) {
            investidor.setCep(cep);
            return this;
        }

        public InvestidorBuilder setCidade(String cidade) {
            investidor.setCidade(cidade);
            return this;
        }

        public InvestidorBuilder setEstado(String estado) {
           investidor.setEstado(estado);
            return this;
        }

        public InvestidorBuilder setPais(String pais) {
           investidor.setPais(pais);
            return this;
        }

        public InvestidorBuilder setCpf(String cpf) {
          investidor.setCpf(cpf);
            return this;
        }

        public InvestidorBuilder setValorInvestido(Double valorInvestido) {
            investidor.setValorInvestido(valorInvestido);
            return this;
        }

    }

