package br.com.project.philipsfullstack.domain;

public abstract class FuncionarioCLT {
    //abstract = diz que a classe não pode ser inicializada - não pode ser criado objetos a partir dela, somente a partir
    //das suas filhas. Essa classe com o obstract vai servir somente para herança
    //Mas a herança pode ser feita a partir sem a inclusão do abstract
    //Está como protected porque eu quero que as classes filhas tenham acesso aos atributos
    protected String nome;
    protected String documento;
    protected Double valorSalario;
    //Isso é uma composição
    protected Endereco endereco;//pego o endereco e coloco dentro da classe FuncionarioCLT


    public FuncionarioCLT() {
    }

    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
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

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
}
