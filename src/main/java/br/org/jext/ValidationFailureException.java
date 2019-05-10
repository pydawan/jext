package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 08/04/2019
 * @since v1.0.0
 */
public class ValidationFailureException extends ValidationException {
    
    private static final long serialVersionUID = -1186645821692370961L;
    
    public ValidationFailureException() {
        super();
    }
    
    public ValidationFailureException(String message) {
        super(message);
    }
    
    public ValidationFailureException(Throwable cause) {
        super(cause);
    }
    
    public ValidationFailureException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ValidationFailureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
