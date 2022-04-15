package br.com.project.philipsfullstack;

public class Vendedor extends FuncionarioCLT{
    //só de usar esse trecho -> extends FuncionarioCLT - eu consigo fazer herança e vai herdar tudo da classe pai
    private Double valorDaBonificacao;

    @Override
    public String  toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                ", valorDaBonificacao=" + valorDaBonificacao +
                '}';
    }
}
