package br.com.project.philipsfullstack;

import br.com.project.philipsfullstack.domain.Endereco;
import br.com.project.philipsfullstack.domain.Gerente;
import br.com.project.philipsfullstack.domain.OperadorDeCaixa;
import br.com.project.philipsfullstack.domain.Vendedor;

//@SpringBootApplication
public class PhilipsFullstackApplication {

	public static void main(String[] args) {
//		SpringApplication.run(PhilipsFullstackApplication.class, args);

		var endereco1 = new Endereco();//utilizando o construtor default
		endereco1.setRua("Endereço da rua");
		System.out.println(endereco1.getRua());

		//utilizando o construtor com argumentos
		var endereco2
		= new Endereco("Rua funcionario", "Complemento endereço funcionario", "bairro funcionario");

		System.out.println(endereco2);
		System.out.println("-----------");

		var vendedor = new Vendedor();
		//Eu consigo utilizar o setNome porque a classe vendedor extends da classe FuncionarioCLT herdando tudo da classe
		//e porque tbm o método setNome() está com public na classe FuncionarioCLT
		vendedor.setNome("Lucas");
		vendedor.setDocumento("123.456.789-00");
		vendedor.setValorSalario(1000d);
		vendedor.calculaBonificacao(2.0);
		vendedor.setEndereco(endereco2);
		System.out.println(vendedor);
		System.out.println("-------------");


		var operadorDeCaixa
				= new OperadorDeCaixa(
				"Lucas",
				"123.456.789-00",
				2000d, endereco2, 50.00);

		System.out.println(operadorDeCaixa);
		System.out.println("-------------");

		Gerente gerente = new Gerente();
		gerente.setNome("Lucas");
		gerente.setDocumento("456.123.789-00");
		gerente.setEndereco(endereco2);
		gerente.setHorasTrabalhadas(20);
		gerente.setValorHora(100d);
		gerente.calculaRemuneracao();
		gerente.calculaBonificacao(3d);
		System.out.println(gerente);




	}

}
