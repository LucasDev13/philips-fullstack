package br.com.project.philipsfullstack.domain;

public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHora;
    private Double valorRemuneracao;

    //void -> não retorna o valor para quem chamou esse método.
    //Posso usar internamente na classe com os atributos
    public void calculaRemuneracao(){
        //this -> referencia diretamente a variável caso haja variáveis com nomes iguais dentro desta classe
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }
    //Eu deixo esse método comentado porque o valor da remuneração será calculado
    //e eu não posso deixar um método exposto para alterar esse valor.
/*    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }*/
}
