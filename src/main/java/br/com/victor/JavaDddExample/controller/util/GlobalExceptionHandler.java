package br.com.victor.JavaDddExample.controller.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.victor.JavaDddExample.exception.InvalidArgumentException;
import br.com.victor.JavaDddExample.exception.UnauthorizedException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(InvalidArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public void handleInvalidArgumentException(
			InvalidArgumentException invalidArgumentException) {
	}

	@ExceptionHandler(InvalidArgumentException.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public void handleUnauthorizedException(
			UnauthorizedException unauthorizedException) {

	}

}
