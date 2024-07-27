package com.asociacionesapp.app_relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.asociacionesapp.app_relationship.repositories.ClientRepository;
import com.asociacionesapp.app_relationship.repositories.InvoiceRepository;

@SpringBootApplication
public class AppRelationshipApplication  implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private InvoiceRepository invoiceRepository;
	public static void main(String[] args) {
		SpringApplication.run(AppRelationshipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
