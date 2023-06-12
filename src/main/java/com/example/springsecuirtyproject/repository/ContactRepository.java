package com.example.springsecuirtyproject.repository;

import com.example.springsecuirtyproject.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	
	
}
