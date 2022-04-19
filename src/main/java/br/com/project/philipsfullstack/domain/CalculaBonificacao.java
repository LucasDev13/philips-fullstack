package br.com.project.philipsfullstack.domain;

public interface CalculaBonificacao {
    //A interface teria que ter a palavra "abstract" porque ela não pode ser instanciada como um objeto
    //na interface eu não posso dar um "new" para criar um objeto vindo de uma interface. Isso é regra
    //Quando falo em interface é falado em assinatura de contrato. Então estou assinando um contrato que a classe que
    //implementa a interface é obrigada a implementar o método que estiver na interface

    //o método da interface por padrão é publico
    //por padrão o método é public mas não precisamso deixar explicito, porque se a interface vai ser reutilizada por
    //outras classe é obrigatório que ela seja public. Sem necessidade de colocar
    //É somente a assinatura do método. Sem implementação
    void calculaBonificacao(Double porcentagemBonificacao);

}
