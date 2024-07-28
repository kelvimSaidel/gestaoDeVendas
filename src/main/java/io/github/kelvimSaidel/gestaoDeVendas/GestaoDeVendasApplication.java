package io.github.kelvimSaidel.gestaoDeVendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GestaoDeVendasApplication {
//	@Bean
//	public CommandLineRunner runner (){
//		return  args -> {
//			String[] lista = {"10","20","30"};
//			for (int i=0; i<lista.length;i++) {
//				System.out.println(lista[i]);
//			}
//		};
//	}


	@GetMapping(value = "/testando")
	public String testando(){
		return  "Deu certo";
	}

	public static void main(String[] args) {
		SpringApplication.run(GestaoDeVendasApplication.class, args);
	}

}
