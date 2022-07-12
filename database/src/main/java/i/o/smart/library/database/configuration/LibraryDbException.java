package i.o.smart.library.database.configuration;

public class LibraryDbException extends Exception
{

    private static final long serialVersionUID = 4143459625161877148L;
    private int statusCode;
    private final String errorCode;
    private final String errorMessage;
    private String errorDetail;
    private Throwable cause;

    public LibraryDbException(int statusCode, String errorCode, String errorMessage, String errorDetail, Throwable cause)
    {
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
        this.cause = cause;
    }

    public LibraryDbException(String errorCode, String errorMessage)
    {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;

    }

    public LibraryDbException(String errorCode, String errorMessage, String errorDetail)
    {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;

    }

    public LibraryDbException(String errorCode, String errorMessage, String errorDetail, Throwable cause)
    {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorDetail = errorDetail;
        this.cause = cause;
    }

    public LibraryDbException(String errorCode, String errorMessage, Exception exception)
    {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.cause = exception;

    }

    public LibraryDbException(String errorCode, String message, Throwable cause)
    {
        this.errorCode = errorCode;
        this.errorMessage = message;
        this.cause = cause;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public Throwable getCause()
    {
        return cause;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getErrorDetail()
    {
        return errorDetail;
    }

}
