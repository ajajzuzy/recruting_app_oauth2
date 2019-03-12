package com.Simple200.authserver.Repository;

import com.Simple200.authserver.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientsRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByClientId(String clientId);

    }

