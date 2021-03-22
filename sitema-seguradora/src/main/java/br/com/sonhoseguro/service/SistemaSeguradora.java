
package br.com.sonhoseguro.service;

import java.util.ArrayList;
import java.util.List;

import br.com.sonhoseguro.model.*;

public class SistemaSeguradora {

	public static void main(String[] args) {
	
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Leonardo");
		pessoa1.setId(1);
		pessoa1.setcpfCnpj("123.123.123-32");
		
//		Pessoa pessoa2 = new Pessoa();
//		pessoa2.setNome("Allisson Andrey");
//		pessoa2.setId(2);
//		pessoa2.setcpfCnpj("555.123.444-33");
		
		List<Endereco> endlist = new ArrayList<Endereco>();
		Endereco end = new Endereco();
		Endereco end2 = new Endereco();
		
		end.setIdPessoa(pessoa1);
		end.setBairro("Janga");
		end.setId(1);
		end.setLocalidade("Paulista");
		end.setBairro("Jardim P");
		end.setCep("12.123-321");
		end.setLogadouro("Rua dos testes");
		
		end2.setIdPessoa(pessoa1);
		end2.setBairro("Piedade");
		end2.setId(2);
		end2.setLocalidade("Lopooa");
		end2.setBairro("Macario");
		end2.setCep("85652621");
		end2.setLogadouro("Rua dos 22");
		
		endlist.add(end); // arraylist na pos 0
		endlist.add(end2);//arraylist na pos 1
		
		
		System.out.println(endlist.get(0).getBairro() + " " + endlist.get(0).getLocalidade());
		System.out.println(endlist.get(1).getBairro() + " " + endlist.get(1).getLocalidade());
		
	
		
		
		
		
//		AutenticaUsuario au = new AutenticaUsuario();
//		
//		//cadastro de usuario com login e senha
//		au.cadastoLogin(cdp, "login", "senha");
//		
//		
//		System.out.println("Teste com a senha incorreta");
//		au.autenticaUser("logon", "senho");
//		
//		System.out.println("-------------------------------");
//		
//		System.out.println("Teste com a senha correta");
//		au.autenticaUser("login", "senha");
		
	
	}
	
}