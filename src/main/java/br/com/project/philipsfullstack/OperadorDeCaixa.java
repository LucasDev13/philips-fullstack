package br.com.project.philipsfullstack;

public class OperadorDeCaixa extends FuncionarioCLT{

    //sobrescrevendo o método construtor da classe FuncionarioCLT
    //recebo os argumentos e repassa para o construtor da super classe ou classe pai
    //super -> indica que vem da classe pai
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco){
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                '}';
    }
}
