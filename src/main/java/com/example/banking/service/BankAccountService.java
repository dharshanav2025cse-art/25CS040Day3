
package com.example.banking.service;
import com.example.banking.model.BankAccount;
import com.example.banking.repository.BankAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepo bankAccountRepo;
    public List<BankAccount> getAllAccounts() {
        return bankAccountRepo.findAll();
    }
    public void addAccount(BankAccount account) {
        bankAccountRepo.save(account);
    }
    public void replaceAccount(int accountId, BankAccount newAccount) {
        newAccount.setAccountId(accountId);
        bankAccountRepo.save(newAccount);
    }
    public void removeAccount(int accountId) {
        bankAccountRepo.deleteById(accountId);
    }
}