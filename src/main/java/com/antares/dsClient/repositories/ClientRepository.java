package com.antares.dsClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antares.dsClient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
