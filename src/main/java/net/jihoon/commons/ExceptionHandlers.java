package net.jihoon.commons;

import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Created by Jihoon Sung on 2016-07-31.
 */
@ControllerAdvice
public class ExceptionHandlers {
//    @ExceptionHandler(UserDuplicatedException.class)
//    public ResponseEntity handleUserDuplicatedException(UserDuplicatedException e) {
//        ErrorResponse errorResponse = new ErrorResponse();
//        errorResponse.setMessage("[" + e.getUsername() + "] 중복된 username 입니다.");
//        errorResponse.setCode("duplicated.username.exception");
//        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//    }
}
