package br.com.sonhoseguro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.sonhoseguro.buscacep.BuscaCep;
import br.com.sonhoseguro.model.Endereco;

@RestController
public class BuscaCepService {
	
	@Autowired
	private BuscaCep buscaCep;
	
	@GetMapping
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

        Endereco endereco = buscaCep.buscaEnderecoPorCep(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
        
        
	
	
	}
	
	
}
