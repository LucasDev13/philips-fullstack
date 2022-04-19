package br.com.project.philipsfullstack;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao{
    private Double valorBonificacao;

    //Quando faço o "implements" estou assinando um contrato com a interface e sou obrigado a implementar o
    //método que está nela.
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() + (porcentagemBonificacao/100)) + 100d;
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome= '" + super.getNome() + '\'' +
                ", documento= '" + super.getDocumento() + '\'' +
                ", endereco= " + super.getEndereco().getBairro() +
                ", horasTrabalhadas= " + super.getHorasTrabalhadas() +
                ", valorHora= " + super.getValorHora() +
                ", valorRemuneracao= " + super.getValorRemuneracao() +
                ", valorBonificacao= " + this.valorBonificacao +
                '}';
    }
}
