package com.example.banking.repository;
import com.example.banking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<User,Integer> {
}
