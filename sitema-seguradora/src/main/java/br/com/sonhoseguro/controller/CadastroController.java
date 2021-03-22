package br.com.sonhoseguro.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.sonhoseguro.model.Endereco;
import br.com.sonhoseguro.model.Pessoa;

public class CadastroController {
	
public static void main(String[] args) {
	
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Leonardo");
		pessoa1.setId(1);
		pessoa1.setcpfCnpj("123.123.123-32");
				
		List<Endereco> endlist = new ArrayList<Endereco>();
		
		Endereco end = new Endereco();
		end.setIdPessoa(pessoa1);
		end.setId(1);
		end.setCidade("Paulista");
		end.setBairro("Jardim P");
		end.setCep("12.123-321");
		end.setLogadouro("Rua dos prédios");
		end.setNumero(35);
		end.setUf("PE");
		
		Endereco end2 = new Endereco();
		end2.setIdPessoa(pessoa1);
		end2.setId(2);
		end2.setCidade("Recife");
		end2.setBairro("Piedade");
		end2.setCep("85.652-621");
		end2.setLogadouro("Curva do S");
		end2.setNumero(5);
		end2.setUf("PE");
		
		endlist.add(end); // arraylist na pos 0
		endlist.add(end2);//arraylist na pos 1
		
		
		System.out.println(endlist.get(0) + "\n" + endlist.get(1));
		
	
		
		
		
		
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
