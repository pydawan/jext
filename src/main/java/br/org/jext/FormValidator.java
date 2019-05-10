package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 08/04/2019
 * @version v1.0.1 09/04/2019
 * @since v1.0.0
 */
public class FormValidator implements Validator {
    
    private static final String INVALID_NULL_ARGUMENT_MESSAGE = "O argumento null é inválido para o parâmetro %s!";
    private static final String INVALID_ARGUMENT_MESSAGE = "O argumento %s recebido pelo parâmetro %s é inválido!";
    
    public FormValidator() {
        super();
    }
    
    public static FormValidator of() {
        return new FormValidator();
    }
    
    public static FormValidator getInstance() {
        return new FormValidator();
    }
    
    @Override
    public void validateRequired(Object value, String failureMessage, String successMessage) throws ValidationException {
        failureMessage = failureMessage == null ? "" : failureMessage;
        successMessage = successMessage == null ? "" : successMessage;
        if (failureMessage.isEmpty()) {
            failureMessage = String.format("null ou \"\" são argumentos inválidos para um objeto validado como required!");
        }
        if (value == null || value.toString().isEmpty()) {
            throw new ValidationFailureException(failureMessage);
        } else {
            if (!successMessage.isEmpty()) {
                throw new ValidationSuccessException(successMessage);
            }
        }
    }
    
    @Override
    public void validateRequired(Object value, String failureMessage) throws ValidationException {
        validateRequired(value, failureMessage, null);
    }
    
    @Override
    public void validateRequired(Object value) throws ValidationException {
        validateRequired(value, null);
    }
    
    @Override
    public void validateRegex(String value, String regex, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException {
        value = value == null ? "" : value;
        failureMessage = failureMessage == null ? "" : failureMessage;
        successMessage = successMessage == null ? "" : successMessage;
        if (failureMessage.isEmpty()) {
            failureMessage = String.format("O argumento %s do parâmetro value não corresponde ao padrão textual %s definido no parâmetro regex!", value, regex);
        }
        if (regex != null) {
            if (value.matches(regex)) {
                if (!successMessage.isEmpty()) {
                    throw new ValidationSuccessException(successMessage);
                }
            } else {
                throw new ValidationFailureException(failureMessage);
            }
        } else {
            throw new IllegalArgumentException(String.format("O argumento %s não é uma expressão regular textual válida para o parâmetro regex!", regex));
        }
    }
    
    @Override
    public void validateRegex(String value, String regex, String failureMessage) throws ValidationException, IllegalArgumentException {
        this.validateRegex(value, regex, failureMessage, null);
    }
    
    @Override
    public void validateRegex(String value, String regex) throws ValidationException, IllegalArgumentException {
        this.validateRegex(value, regex, null);
    }
    
    @Override
    public void validateNumber(Number x, Number y, String validation, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException {
        String exceptionMessage = "";
        validation = validation == null ? "" : validation;
        failureMessage = failureMessage == null ? "" : failureMessage;
        successMessage = successMessage == null ? "" : successMessage;
        if (x == null) {
            throw new IllegalArgumentException(String.format(INVALID_NULL_ARGUMENT_MESSAGE, "x"));
        }
        if (y == null) {
            throw new IllegalArgumentException(String.format(INVALID_NULL_ARGUMENT_MESSAGE, "y"));
        }
        if (!x.getClass().equals(y.getClass())) {
            exceptionMessage = String.format("x e y são de tipos de dados diferentes! x = %s, y = %s", x.getClass().getName(), y.getClass().getName());
            throw new IllegalArgumentException(exceptionMessage);
        }
        if (validation.matches("^(eq|neq|gt|gte|le|lte)$")) {
            boolean validationFailure = false;
            switch (validation) {
                case "eq":
                    failureMessage = failureMessage.isEmpty() ? "x e y não são iguais! x = %s, y = %s" : failureMessage;
                    if (!(x.equals(y))) {
                        validationFailure = true;
                    }
                    break;
                case "neq":
                    failureMessage = failureMessage.isEmpty() ? "x e y são iguais! x = %s, y = %s" : failureMessage;
                    if (x.equals(y)) {
                        validationFailure = true;
                    }
                    break;
                case "gt":
                    failureMessage = failureMessage.isEmpty() ? "x não é maior que y! x = %s, y = %s" : failureMessage;
                    if (!(x.doubleValue() > y.doubleValue())) {
                        validationFailure = true;
                    }
                    break;
                case "gte":
                    failureMessage = failureMessage.isEmpty() ? "x não é maior que ou igual a y! x = %s, y = %s" : failureMessage;
                    if (!(x.doubleValue() >= y.doubleValue())) {
                        validationFailure = true;
                    }
                    break;
                case "lt":
                    failureMessage = failureMessage.isEmpty() ? "x não é menor que y! x = %s, y = %s" : failureMessage;
                    if (!(x.doubleValue() < y.doubleValue())) {
                        validationFailure = true;
                    }
                    break;
                case "lte":
                    failureMessage = failureMessage.isEmpty() ? "x não é menor que ou igual a y! x = %s, y = %s" : failureMessage;
                    if (!(x.doubleValue() <= y.doubleValue())) {
                        validationFailure = true;
                    }
                    break;
                default:
                    break;
            }
            if (validationFailure) {
                failureMessage = String.format(failureMessage, x, y);
                throw new ValidationFailureException(failureMessage);
            } else {
                if (!successMessage.isEmpty()) {
                    throw new ValidationSuccessException(successMessage);
                }
            }
        } else {
            throw new IllegalArgumentException(String.format(INVALID_ARGUMENT_MESSAGE, validation, "validation"));
        }
    }
    
    @Override
    public void validateNumber(Number x, Number y, String validation, String failureMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, validation, failureMessage, null);
    }
    
    @Override
    public void validateNumber(Number x, Number y, String validation) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, validation, null);
    }
    
    @Override
    public void validateEqualTo(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "eq", failureMessage, successMessage);
    }
    
    @Override
    public void validateEqualTo(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "eq", failureMessage);
    }
    
    @Override
    public void validateEqualTo(Number x, Number y) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "eq");
    }
    
    @Override
    public void validateNotEqualTo(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "neq", failureMessage, successMessage);
    }
    
    @Override
    public void validateNotEqualTo(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "neq", failureMessage, null);
    }
    
    @Override
    public void validateNotEqualTo(Number x, Number y) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "neq", null);
    }
    
    @Override
    public void validateGreaterThan(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "gt", failureMessage, successMessage);
    }
    
    @Override
    public void validateGreaterThan(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "gt", failureMessage, null);
    }
    
    @Override
    public void validateGreaterThan(Number x, Number y) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "gt", null);
    }
    
    @Override
    public void validateGreaterThanOrEqualTo(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "gte", failureMessage, successMessage);
    }
    
    @Override
    public void validateGreaterThanOrEqualTo(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "gte", failureMessage, null);
    }
    
    @Override
    public void validateGreaterThanOrEqualTo(Number x, Number y) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "gte", null);
    }
    
    @Override
    public void validateLessThan(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "lt", failureMessage, successMessage);
    }
    
    @Override
    public void validateLessThan(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "lt", failureMessage, null);
    }
    
    @Override
    public void validateLessThan(Number x, Number y) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "lt", null);
    }
    
    @Override
    public void validateLessThanOrEqualTo(Number x, Number y, String failureMessage, String successMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "lte", failureMessage, successMessage);
    }
    
    @Override
    public void validateLessThanOrEqualTo(Number x, Number y, String failureMessage) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "lte", failureMessage, null);
    }
    
    @Override
    public void validateLessThanOrEqualTo(Number x, Number y) throws ValidationException, IllegalArgumentException {
        validateNumber(x, y, "lte", null);
    }

    @Override
    public void validateIsTrue(boolean condition, String failureMessage, String successMessage) throws ValidationException {
        failureMessage = failureMessage == null ? "" : failureMessage;
        successMessage = successMessage == null ? "" : successMessage;
        if (condition == false) {
            failureMessage = failureMessage.isEmpty() ? "A condição estabelecida não foi satisfeita!" : failureMessage;
            throw new ValidationFailureException(failureMessage);
        } else {
            if (!successMessage.isEmpty()) {
                throw new ValidationSuccessException(successMessage);
            }
        }
    }

    @Override
    public void validateIsTrue(boolean condition, String failureMessage) throws ValidationException {
        validateIsTrue(condition, failureMessage, null);
    }

    @Override
    public void validateIsTrue(boolean condition) throws ValidationException {
        validateIsTrue(condition, null);
    }

    @Override
    public void validateIsFalse(boolean condition, String failureMessage, String successMessage) throws ValidationException {
        validateIsTrue(!condition, failureMessage, successMessage);
    }

    @Override
    public void validateIsFalse(boolean condition, String failureMessage) throws ValidationException {
        validateIsFalse(condition, failureMessage, null);
    }

    @Override
    public void validateIsFalse(boolean condition) throws ValidationException {
        validateIsFalse(condition, null);
    }

    @Override
    public void validateIsNotTrue(boolean condition, String failureMessage, String successMessage) throws ValidationException {
        validateIsFalse(condition, failureMessage, successMessage);
    }

    @Override
    public void validateIsNotTrue(boolean condition, String failureMessage) throws ValidationException {
        validateIsFalse(condition, failureMessage, null);
    }

    @Override
    public void validateIsNotTrue(boolean condition) throws ValidationException {
        validateIsFalse(condition, null);
    }

    @Override
    public void validateIsNotFalse(boolean condition, String failureMessage, String successMessage) throws ValidationException {
        validateIsTrue(condition, failureMessage, successMessage);
    }

    @Override
    public void validateIsNotFalse(boolean condition, String failureMessage) throws ValidationException {
        validateIsTrue(condition, failureMessage, null);
    }

    @Override
    public void validateIsNotFalse(boolean condition) throws ValidationException {
        validateIsTrue(condition, null);
    }

    @Override
    public void validateIsEquals(Object o1, Object o2, String failureMessage, String successMessage) throws ValidationException {
        boolean result = false;
        failureMessage = failureMessage == null ? "" : failureMessage;
        successMessage = successMessage == null ? "" : successMessage;
        if (o1 != null) {
            result = o1.equals(o2);
        } else if (o2 != null) {
            result = o2.equals(o1);
        } else {
            result = o1 == o2;
        }
        if (result == false) {
            failureMessage = failureMessage.isEmpty() ? "Os objetos não são iguais!" : failureMessage;
            throw new ValidationFailureException(failureMessage);
        } else {
            if (!successMessage.isEmpty()) {
                throw new ValidationSuccessException(successMessage);
            }
        }
    }

    @Override
    public void validateIsEquals(Object o1, Object o2, String failureMessage) throws ValidationException {
        validateIsEquals(o1, o2, failureMessage, null);
    }

    @Override
    public void validateIsEquals(Object o1, Object o2) throws ValidationException {
        validateIsEquals(o1, o2, null);
    }

    @Override
    public void validateIsNotEquals(Object o1, Object o2, String failureMessage, String successMessage) throws ValidationException {
        boolean result = false;
        failureMessage = failureMessage == null ? "" : failureMessage;
        successMessage = successMessage == null ? "" : successMessage;
        if (o1 != null) {
            result = !o1.equals(o2);
        } else if (o2 != null) {
            result= !o2.equals(o1);
        } else {
            result = o1 != o2;
        }
        if (result == false) {
            failureMessage = failureMessage.isEmpty() ? "Os objetos não são diferentes!" : failureMessage;
            throw new ValidationFailureException(failureMessage);
        } else {
            if (!successMessage.isEmpty()) {
                throw new ValidationSuccessException(successMessage);
            }
        }
    }

    @Override
    public void validateIsNotEquals(Object o1, Object o2, String failureMessage) throws ValidationException {
        validateIsNotEquals(o1, o2, failureMessage, null);
    }

    @Override
    public void validateIsNotEquals(Object o1, Object o2) throws ValidationException {
        validateIsNotEquals(o1, o2, null);
    }
    
}
