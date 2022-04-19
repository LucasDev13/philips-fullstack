package br.com.project.philipsfullstack.domain;

import br.com.project.philipsfullstack.domain.CalculaBonificacao;
import br.com.project.philipsfullstack.domain.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    //só de usar esse trecho -> extends FuncionarioCLT - eu consigo fazer herança e vai herdar tudo da classe pai
    private Double valorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        //a classe que implementar a interface, ela é obrigada a fazer a implementação do código.
        //this.valorSalario = vem da super
        //super.valorSalario = tbm vem da super
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                ", valorDaBonificacao=" + valorDaBonificacao +
                '}';
    }
}
