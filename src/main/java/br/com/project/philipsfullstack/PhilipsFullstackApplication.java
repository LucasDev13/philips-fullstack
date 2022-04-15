package br.com.project.philipsfullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		vendedor.setValorSalario(10000d);
		vendedor.setEndereco(endereco2);
		System.out.println(vendedor);
		System.out.println("-------------");


		var operadorDeCaixa
				= new OperadorDeCaixa(
				"Lucas",
				"123.456.789-00",
				10000d, endereco2);

		System.out.println(operadorDeCaixa);
		System.out.printf("-------------");
	}

}
