package io.github.isaquearaujo.helpdesk;

import io.github.isaquearaujo.helpdesk.domain.Chamado;
import io.github.isaquearaujo.helpdesk.domain.Cliente;
import io.github.isaquearaujo.helpdesk.domain.Tecnico;
import io.github.isaquearaujo.helpdesk.domain.enums.Perfil;
import io.github.isaquearaujo.helpdesk.domain.enums.Prioridade;
import io.github.isaquearaujo.helpdesk.domain.enums.Status;
import io.github.isaquearaujo.helpdesk.repositories.ChamadoRepository;
import io.github.isaquearaujo.helpdesk.repositories.ClienteRepository;
import io.github.isaquearaujo.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelpdeskApplication  {

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

}
