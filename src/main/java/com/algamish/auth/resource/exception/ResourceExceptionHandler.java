package com.algamish.auth.resource.exception;

import com.algamish.auth.service.exception.UserAlreadyExists;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(UserAlreadyExists.class)
    public ResponseEntity<StandardError> objectAlreadyExist(final UserAlreadyExists exception,
        final HttpServletRequest request) {
        StandardError err = buildStandardError(exception, request, HttpStatus.CONFLICT);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(err);
    }

    private StandardError buildStandardError(final RuntimeException exception, final HttpServletRequest request,
        final HttpStatus httpStatus) {
        return StandardError.builder()
            .timestamp(System.currentTimeMillis())
            .status(httpStatus.value())
            .error(httpStatus.getReasonPhrase())
            .message(exception.getMessage())
            .path(request.getRequestURI())
            .build();
    }

}