package io.github.isaquearaujo.helpdesk.repositories;

import io.github.isaquearaujo.helpdesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
