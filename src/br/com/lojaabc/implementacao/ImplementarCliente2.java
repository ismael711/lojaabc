package br.com.lojaabc.implementacao;

import br.com.lojaabc.lib.Magica;
import br.com.lojaabc.modelo.Cliente;
import br.com.lojaabc.modelo.PessoaFisica;
import br.com.lojaabc.modelo.PessoaJuridica;

public class ImplementarCliente2 {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		char resposta = Magica.s("Digite F ou J").charAt(0);
		if (resposta=='F') {
			cliente = new PessoaFisica(
					"Nome da PF", 
					"email da PF", 
					"12345678",
					"123456",
					"123456x"
					);
		}else if (resposta=='J') {
			cliente = new PessoaJuridica(
					"Nome da PJ", 
					"email da PJ", 
					"12345678",
					"1234560001",
					"cnae"
					);
		}else {
			System.out.println("Opção inválida");
		}
		
		//System.out.println(cliente.toString());
		System.out.println(cliente.getResumo());

		// Para chamar um método especifico de uma classe filha
		// sem ter que criar o método na classe pai.
		if (cliente instanceof PessoaJuridica) {
		System.out.println(((PessoaJuridica) cliente).exibirDocumentacoes());
		}
		

	}

}
