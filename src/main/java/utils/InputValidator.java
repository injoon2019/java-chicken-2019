package utils;

public class InputValidator {

    private static final String OPTION_ERROR_MESSAGE = "1~3 사이의 숫자를 입력하세요";
    private static final String ORDER_ERROR_MESSAGE = "0~99 사이의 숫자를 입력하세요";
    private static final String PAY_METHOD_ERROR_MESSAGE = "1 또는 2를 입력하세요";
    private static final int OPTION_MIN = 1;
    private static final int OPTION_MAX = 3;
    private static final int ORDER_MAX = 99;
    private static final int ORDER_MIN = 0;
    private static final int PAY_METHOD_MIN = 1;
    private static final int PAY_METHOD_MAX = 2;

    public static void validateUserOption(String userOption) throws IllegalArgumentException {
        try {
            int intOption = Integer.parseInt(userOption);
            if (intOption < OPTION_MIN || intOption > OPTION_MAX) {
                throw new IllegalArgumentException(OPTION_ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(OPTION_ERROR_MESSAGE);
        }
    }

    public static void validateTableNumber(String tableNumber) {
        try {
            Integer.parseInt(tableNumber);
        } catch (Exception e) {
            throw new IllegalArgumentException(OPTION_ERROR_MESSAGE);
        }
    }

    public static void validateMenuAmount(String orderAmount) {
        try {
            int intOrderAmount = Integer.parseInt(orderAmount);
            if (intOrderAmount < ORDER_MIN || intOrderAmount > ORDER_MAX) {
                throw new IllegalArgumentException(ORDER_ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(ORDER_ERROR_MESSAGE);
        }
    }

    public static void validateMenuNumber(String orderAmount) {
        try {
            int intOrderAmount = Integer.parseInt(orderAmount);
            if (intOrderAmount < ORDER_MIN || intOrderAmount > ORDER_MAX) {
                throw new IllegalArgumentException(ORDER_ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(ORDER_ERROR_MESSAGE);
        }
    }

    public static void validatePayMethod(String payMethod) {
        try {
            int intPayMethod = Integer.parseInt(payMethod);
            if (intPayMethod < PAY_METHOD_MIN || intPayMethod > PAY_METHOD_MAX) {
                throw new IllegalArgumentException(PAY_METHOD_ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(PAY_METHOD_ERROR_MESSAGE);
        }
    }
}
