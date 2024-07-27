package com.asociacionesapp.app_relationship.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.asociacionesapp.app_relationship.entities.Client;

import java.util.*;

public interface ClientRepository extends CrudRepository<Client,Long>{
    @Query("select c from Client c left join fetch c.addresses where c.id=?1")
    Optional<Client> findOneWithAddresses(Long id);

    @Query("select c from Client c left join fetch c.invoices where c.id=?1")
    Optional<Client> findOneWithInvoices(Long id);

    @Query("select c from Client c left join fetch c.invoices left join fetch c.addresses where c.id=?1")
    Optional<Client> findOne(Long id);
}
