package br.com.lojaabc.implementacao;

import br.com.lojaabc.lib.Magica;
import br.com.lojaabc.modelo.PessoaFisica;
import br.com.lojaabc.modelo.PessoaJuridica;

public class ImplementarCliente {

	public static void main(String[] args) {
		
		char resposta = Magica.s("Digite F ou J").charAt(0);
		if (resposta=='F') {
			PessoaFisica pf = new PessoaFisica(
					"Nome da PF",
					"email da PF",
					"12345",
					"1234556",
					"123456x"
					);
			System.out.println(pf.toString());
		}else if (resposta=='J') {
			PessoaJuridica pj = new PessoaJuridica(
					"Nome da PJ",
					"email da PJ",
					"12345678",
					"123455677",
					"123456001"
					);
					
		}else {
			System.out.println("Op��o inv�lida");
		}

	}

}
