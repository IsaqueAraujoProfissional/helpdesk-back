package io.github.isaquearaujo.helpdesk.repositories;

import io.github.isaquearaujo.helpdesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
