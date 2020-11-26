public class UserRegistrationException extends Exception {
    enum ExceptionType
    {
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_PHONE_NUMBER, INVALID_PASSWORD, GIVEN_NULL, GIVEN_EMPTY ;
    }

    ExceptionType type;

    public UserRegistrationException(ExceptionType type, String massage) {
        super(massage);
        this.type = type;
    }


}
