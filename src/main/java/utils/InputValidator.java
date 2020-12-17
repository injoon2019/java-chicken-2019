package utils;

import domain.MenuRepository;
import domain.TableRepository;

public class InputValidator {

    private static final String OPTION_ERROR_MESSAGE = "1~3 사이의 숫자를 입력하세요";
    private static final String AMOUNT_ERROR_MESSAGE = "0~99 사이의 숫자를 입력하세요";
    private static final String TABLE_ERROR_MESSAGE = "저장되어 있는 테이블 숫자를 입력하세요";
    private static final String PAY_METHOD_ERROR_MESSAGE = "1 또는 2를 입력하세요";
    private static final String MENU_NUMBER_ERROR_MESSAGE = "저장되어 있는 메뉴를 입력하세요";
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
            int intTableNumber = Integer.parseInt(tableNumber);
            if (!TableRepository.getTableNumbers().contains(intTableNumber)) {
                throw new IllegalArgumentException(TABLE_ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(TABLE_ERROR_MESSAGE);
        }
    }

    public static void validateMenuAmount(String orderAmount) {
        try {
            int intOrderAmount = Integer.parseInt(orderAmount);
            if (intOrderAmount < ORDER_MIN || intOrderAmount > ORDER_MAX) {
                throw new IllegalArgumentException(AMOUNT_ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(AMOUNT_ERROR_MESSAGE);
        }
    }

    public static void validateMenuNumber(String menuNumber) {
        try {
            int intMenuNumber = Integer.parseInt(menuNumber);
            if (!MenuRepository.getMenuNumbers().contains(intMenuNumber)) {
                throw new IllegalArgumentException(MENU_NUMBER_ERROR_MESSAGE);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(MENU_NUMBER_ERROR_MESSAGE);
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
