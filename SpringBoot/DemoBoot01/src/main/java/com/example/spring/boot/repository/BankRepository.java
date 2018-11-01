package com.example.spring.boot.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.spring.boot.model.Bank;

public interface BankRepository extends CrudRepository<Bank,Integer>{
	public Bank findByName(String name);
	public Bank findByBankId(Integer bankId);
}
