package net.jihoon.accounts;

/**
 * Created by Jihoon Sung on 2016-07-06.
 */
public class UserDuplicatedException extends RuntimeException {

    String username;

    public UserDuplicatedException(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
