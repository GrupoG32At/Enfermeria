package com.usa.enfermeria.repositorios;

import com.usa.enfermeria.modelos.ClientModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositorio extends JpaRepository<ClientModelo,Integer> {
}
