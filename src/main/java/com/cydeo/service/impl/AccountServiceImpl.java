package com.cydeo.service.impl;

import com.cydeo.enums.AccountStatus;
import com.cydeo.enums.AccountType;
import com.cydeo.model.Account;
import com.cydeo.repository.AccountRepository;
import com.cydeo.service.AccountService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {

   AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account createAccount(BigDecimal balance, Date createDate, AccountType accountType, Long userId) {
        //we need to create Account object
        Account account = Account.builder().accountId(UUID.randomUUID()).userId(userId)
        .balance(balance).accountType(accountType).creationDate(createDate).accountStatus(AccountStatus.ACTIVE).build();
        //save into the database (repository)
        //return the object created
        return accountRepository.save(account);
    }

    @Override
    public List<Account> listAllAccounts() {
        return accountRepository.findAll();
    }
}
