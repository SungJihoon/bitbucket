package net.jihoon.accounts;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Jihoon Sung on 2016-06-29.
 */
public class AccountDto {

    @Data
    public static class Create {
        @NotBlank
        @Size(min = 5)
        private String username;

        @NotBlank
        @Size(min = 5)
        private String password;
    }

    @Data
    public static class Response {
        private Long id;
        private String username;
        private String fullName;
        private Date joined;
        private Date updated;
    }
}
