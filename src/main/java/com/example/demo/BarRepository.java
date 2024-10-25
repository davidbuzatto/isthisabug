package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
@RepositoryRestResource
public interface BarRepository extends JpaRepository<Bar, Long> {
}