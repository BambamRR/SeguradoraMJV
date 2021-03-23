package br.com.sonhoseguro.sitemaseguradora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SitemaSeguradoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SitemaSeguradoraApplication.class, args);
	}

}
