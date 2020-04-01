package com.mindtree.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionHandler {
	private ResponseEntity<Object> buildResponseEntity(ApiErrorResponse response, HttpStatus httpStatus) {
		return ResponseEntity.status(httpStatus).header("status", String.valueOf(httpStatus)).body(response);
	}

	@org.springframework.web.bind.annotation.ExceptionHandler
	@ResponseStatus(value = HttpStatus.CONFLICT)
	public final ResponseEntity<Object> handleInvalidSalaryExceptions(InvalidSalaryException ex, WebRequest request) {
		ApiErrorResponse response = new ApiErrorResponse();

		response.setCause(ex.getLocalizedMessage());
		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.CONFLICT);
		response.setHttpStatusCode(100);
		response.setError(true);

		return buildResponseEntity(response, HttpStatus.CONFLICT);

	}

	@ResponseStatus(value = HttpStatus.CONFLICT)
	public final ResponseEntity<Object> handleNameIsShortExceptions(NameIsShortException ex, WebRequest request) {
		ApiErrorResponse response = new ApiErrorResponse();

		response.setCause(ex.getLocalizedMessage());
		response.setMessage(ex.getMessage());
		response.setHttpStatus(HttpStatus.CONFLICT);
		response.setHttpStatusCode(100);
		response.setError(true);

		return buildResponseEntity(response, HttpStatus.CONFLICT);

	}

}
