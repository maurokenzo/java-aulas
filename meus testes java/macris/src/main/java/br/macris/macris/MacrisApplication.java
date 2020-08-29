package br.macris.macris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class MacrisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacrisApplication.class, args);
	}
}
