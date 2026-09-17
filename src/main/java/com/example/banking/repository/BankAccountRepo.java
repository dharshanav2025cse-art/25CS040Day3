package com.example.banking.repository;
import com.example.banking.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BankAccountRepo extends JpaRepository<BankAccount, Integer> {
}