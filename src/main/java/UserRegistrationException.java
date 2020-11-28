public class UserRegistrationException extends Exception {
    enum ExceptionType
    {
        GIVEN_NULL, GIVEN_EMPTY
    }

    ExceptionType type;

    public UserRegistrationException(ExceptionType type, String massage) {
        super(massage);
        this.type = type;
    }


}
