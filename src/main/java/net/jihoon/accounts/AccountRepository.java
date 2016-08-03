package net.jihoon.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Jihoon Sung on 2016-06-29.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
