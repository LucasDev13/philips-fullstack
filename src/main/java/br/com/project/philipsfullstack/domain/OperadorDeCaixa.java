package br.com.project.philipsfullstack.domain;

import br.com.project.philipsfullstack.domain.Endereco;
import br.com.project.philipsfullstack.domain.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {

    private Double quebraDeCaixa;

    //sobrescrevendo o método construtor da classe FuncionarioCLT
    //recebo os argumentos e repassa para o construtor da super classe ou classe pai
    //super -> indica que vem da classe pai
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco, Double quebraDeCaixa){
        //super -> referencia o construtor da classe pai passando os valores dos atributos para ela.
        super(nome, documento, valorSalario, endereco);
        //Quando eu receber o valor do atributo quebraDeCaixa, ele vai ser transferido a partir
        //da linhha de baixo para o atributo da classe
        this.quebraDeCaixa = quebraDeCaixa;
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
