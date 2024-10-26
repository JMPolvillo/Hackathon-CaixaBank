package com.hackathon.bankingapp.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(UserNotFoundException.class)
  public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
  }

  @ExceptionHandler(EmailAlreadyExistsException.class)
  public ResponseEntity<String> handleEmailAlreadyExistsException(EmailAlreadyExistsException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
  }

  @ExceptionHandler(PhoneNumberAlreadyExistsException.class)
  public ResponseEntity<String> handlePhoneNumberAlreadyExistsException(PhoneNumberAlreadyExistsException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
  }

  @ExceptionHandler(BadCredentialsException.class)
  public ResponseEntity<String> handleBadCredentialsException(BadCredentialsException e) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
  }

  @ExceptionHandler(PasswordValidationException.class)
  public ResponseEntity<String> handlePasswordValidationException(PasswordValidationException e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
  }

  @ExceptionHandler(JwtTokenMissingException.class)
  public ResponseEntity<String> handleJwtTokenMissingException(JwtTokenMissingException e) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
  }

  @ExceptionHandler(JwtTokenExpiredException.class)
  public ResponseEntity<String> handleJwtTokenExpiredException(JwtTokenExpiredException e) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
  }

  @ExceptionHandler(JwtTokenInvalidException.class)
  public ResponseEntity<String> handleJwtTokenInvalidException(JwtTokenInvalidException e) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
  }

  @ExceptionHandler(JwtAuthenticationException.class)
  public ResponseEntity<String> handleJwtAuthenticationException(JwtAuthenticationException e) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
  }
}