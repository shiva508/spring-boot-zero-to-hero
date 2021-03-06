package com.pool.repository.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pool.model.account.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
