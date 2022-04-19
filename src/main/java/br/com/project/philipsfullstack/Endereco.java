package br.com.project.philipsfullstack;

public class Endereco {

    private String rua;
    private String complemento;
    private String bairro;

    //Esse é o construtor defaul vazio. Se ele não for definido o próprio java vai definir ele na criação do objeto
    //como vazio
    public Endereco() {
    }

    //construtor serve para inicializar o objeto com dados
    //Definição de um construtor com todos os atributos
    //O construtor tbm é um método, onde recebe parametros na inicialização do objeto e setta nos atributos os dados
    //O construtor serve para que eu poça dar um new em uma nova variável que vai controlar esse objeto, mesmo que
    // seja vazio(sem implementação)
    //Ele vai receber os dados e atribuir eles nos parâmetros
    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    //o get só retorna o valor
    public String getRua() {
        return rua;
    }

    //o set modifica o valor do atributo - atribui um valor para o atributo
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
