package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 08/04/2019
 * @since v1.0.0
 */
public interface Validator {
    
    // REQUIRED VALIDATION
    void validateRequired(Object value, String failureMessage, String successMessage) throws ValidationException;
    void validateRequired(Object value, String failureMessage) throws ValidationException;
    void validateRequired(Object value) throws ValidationException;
    
    // REGEX VALIDATION
    void validateRegex(String value, String regex, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException;
    void validateRegex(String value, String regex, String failureMessage) throws ValidationException, IllegalArgumentException;
    void validateRegex(String value, String regex) throws ValidationException,IllegalArgumentException;
    
    // NUMBER VALIDATION
    void validateNumber(Number x, Number y, String validation, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException;                 
    void validateNumber(Number x, Number y, String validation, String failureMessage) throws ValidationException, IllegalArgumentException;
    void validateNumber(Number x, Number y, String validation) throws ValidationException, IllegalArgumentException;
    
    // EQUAL VALIDATION
    void validateEqualTo(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException;
    void validateEqualTo(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException;
    void validateEqualTo(Number x, Number y) throws ValidationException, IllegalArgumentException;
    
    // NOT EQUAL VALIDATION
    void validateNotEqualTo(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException;
    void validateNotEqualTo(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException;
    void validateNotEqualTo(Number x, Number y) throws ValidationException, IllegalArgumentException;
    
    // GREATER THAN VALIDATION
    void validateGreaterThan(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException;
    void validateGreaterThan(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException;
    void validateGreaterThan(Number x, Number y) throws ValidationException, IllegalArgumentException;
    
    // GREATER THAN OR EQUAL TO VALIDATION
    void validateGreaterThanOrEqualTo(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException;
    void validateGreaterThanOrEqualTo(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException;
    void validateGreaterThanOrEqualTo(Number x, Number y) throws ValidationException, IllegalArgumentException;
    
    // LESS THAN VALIDATION
    void validateLessThan(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException;
    void validateLessThan(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException;
    void validateLessThan(Number x, Number y) throws ValidationException, IllegalArgumentException;
    
    // LESS THAN OR EQUAL TO VALIDATION
    void validateLessThanOrEqualTo(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException;
    void validateLessThanOrEqualTo(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException;
    void validateLessThanOrEqualTo(Number x, Number y) throws ValidationException, IllegalArgumentException;
    
    void validateIsTrue(boolean condition, String failureMessage, String successMessage) throws ValidationException;
    void validateIsTrue(boolean condition, String failureMessage) throws ValidationException;
    void validateIsTrue(boolean condition) throws ValidationException;
    
    void validateIsFalse(boolean condition, String failureMessage, String successMessage) throws ValidationException;
    void validateIsFalse(boolean condition, String failureMessage) throws ValidationException;
    void validateIsFalse(boolean condition) throws ValidationException;
    
    void validateIsNotTrue(boolean condition, String failureMessage, String successMessage) throws ValidationException;
    void validateIsNotTrue(boolean condition, String failureMessage) throws ValidationException;
    void validateIsNotTrue(boolean condition) throws ValidationException;
    
    void validateIsNotFalse(boolean condition, String failureMessage, String successMessage) throws ValidationException;
    void validateIsNotFalse(boolean condition, String failureMessage) throws ValidationException;
    void validateIsNotFalse(boolean condition) throws ValidationException;
    
    void validateIsEquals(Object o1, Object o2, String failureMessage, String successMessage) throws ValidationException;
    void validateIsEquals(Object o1, Object o2, String failureMessage) throws ValidationException;
    void validateIsEquals(Object o1, Object o2) throws ValidationException;
    
    void validateIsNotEquals(Object o1, Object o2, String failureMessage, String successMessage) throws ValidationException;
    void validateIsNotEquals(Object o1, Object o2, String failureMessage) throws ValidationException;
    void validateIsNotEquals(Object o1, Object o2) throws ValidationException;
    
}
