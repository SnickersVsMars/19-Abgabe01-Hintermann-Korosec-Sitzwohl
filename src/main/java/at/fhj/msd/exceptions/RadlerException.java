package at.fhj.msd.exceptions;

/**
 * Exception that is used when Beer is mixed with a non-alcoholic
 * drink
 */
public class RadlerException extends Exception {

    /**
     * Creates a new instance of the RadlerException, containing
     * the given error message
     *
     * @param errorMessage message of the exception
     */
    public RadlerException(String errorMessage) {
        super(errorMessage);
    }
}
