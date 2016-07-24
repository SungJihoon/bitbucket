package net.bbada.accounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Jihoon Sung on 2016-06-29.
 */
public class AccountTest {

    @Test
    public void getterSetter() {
        Account account = new Account();
        account.setUsername("klimt");
        account.setPassword("bbada");
        assertThat(account.getUsername(), is("klimt"));
    }

}