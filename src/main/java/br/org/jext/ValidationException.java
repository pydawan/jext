package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 08/04/2019
 * @since v1.0.0
 */
public class ValidationException extends Exception {
    
    private static final long serialVersionUID = -928851852655372783L;

    public ValidationException() {
        super();
    }
    
    public ValidationException(String message) {
        super(message);
    }
    
    public ValidationException(Throwable cause) {
        super(cause);
    }
    
    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
