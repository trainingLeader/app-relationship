package com.asociacionesapp.app_relationship.repositories;

import org.springframework.data.repository.CrudRepository;

import com.asociacionesapp.app_relationship.entities.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice,Long> {

}
