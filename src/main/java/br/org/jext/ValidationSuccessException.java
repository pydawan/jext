package br.org.jext;

/**
 * @author thiago-amm
 * @version v1.0.0 08/04/2019
 * @since v1.0.0
 */
public class ValidationSuccessException extends ValidationException {
    
    private static final long serialVersionUID = -8622011225252984701L;
    
    public ValidationSuccessException() {
        super();
    }
    
    public ValidationSuccessException(String message) {
        super(message);
    }
    
    public ValidationSuccessException(Throwable cause) {
        super(cause);
    }
    
    public ValidationSuccessException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ValidationSuccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
