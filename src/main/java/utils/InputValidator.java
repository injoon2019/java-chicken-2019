package utils;

public class InputValidator {
    private static final String OPTION_ERROR_MESSAGE = "1~3사이의 숫자를 입력하세요";
    private static final int OPTION_MIN = 1;
    private static final int OPTION_MAX = 3;
    public static void validateUserOption(String userOption) throws IllegalArgumentException {
        int intOption = Integer.parseInt(userOption);
        if (intOption < OPTION_MIN || intOption > OPTION_MAX) {
            throw new IllegalArgumentException(OPTION_ERROR_MESSAGE);
        }
    }
}
