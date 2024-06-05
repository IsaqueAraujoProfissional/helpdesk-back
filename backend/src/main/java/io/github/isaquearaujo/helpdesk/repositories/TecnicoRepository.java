package io.github.isaquearaujo.helpdesk.repositories;

import io.github.isaquearaujo.helpdesk.domain.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
}
