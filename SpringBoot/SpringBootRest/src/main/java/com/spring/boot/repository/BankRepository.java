package com.spring.boot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.model.Bank;

public interface BankRepository extends JpaRepository<Bank,Long>{

}
