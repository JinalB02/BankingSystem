package com.example.springsecuirtyproject.repository;

import com.example.springsecuirtyproject.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);

}
