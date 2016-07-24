package net.bbada.commons;

import lombok.Data;

import java.util.List;

/**
 * Created by Jihoon Sung on 2016-06-30.
 */
@Data
public class ErrorResponse {

    private String message;

    private String code;

    private List<FieldError> errors;

    // TODO
    public static class FieldError {
        private String column;
        private String value;
        private String reason;
    }

}
