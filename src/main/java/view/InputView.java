package view;

import java.util.Scanner;
import utils.InputValidator;

public class InputView {
    private static final String ERROR_PREFIX = "[ERROR] :";
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        String tableNumber = scanner.nextLine().trim();
        try {
            InputValidator.validateTableNumber(tableNumber);
            return Integer.parseInt(tableNumber);
        } catch (IllegalArgumentException iae) {
            System.out.println(ERROR_PREFIX + iae.getMessage());
            return inputTableNumber();
        }
    }

    public static String askUserOption() {
        System.out.println("##원하는 기능을 선택하세요.");
        String userOption = scanner.nextLine().trim();
        try {
            InputValidator.validateUserOption(userOption);
            return userOption;
        } catch (IllegalArgumentException iae) {
            System.out.println(ERROR_PREFIX + iae.getMessage());
            return askUserOption();
        }
    }

    public static int inputMenuNumber() {
        System.out.println("##등록할 메뉴를 선택하세요");
        String menuNumber = scanner.nextLine().trim();
        try {
            InputValidator.validateMenuNumber(menuNumber);
            return Integer.parseInt(menuNumber);
        } catch (IllegalArgumentException iae) {
            System.out.println(ERROR_PREFIX + iae.getMessage());
            return inputMenuNumber();
        }
    }

    public static int inputMenuAmount() {
        System.out.println("##메뉴의 수량을 입력하세요");
        String menuAmount = scanner.nextLine().trim();
        try {
            InputValidator.validateMenuAmount(menuAmount);
            return Integer.parseInt(menuAmount);
        } catch (IllegalArgumentException iae) {
            System.out.println(ERROR_PREFIX + iae.getMessage());
            return inputMenuAmount();
        }
    }

    public static int inputTableNumberToPay() {
        System.out.println("## 테이블을 선택하세요.");
        String tableNumber = scanner.nextLine().trim();
        try {
            InputValidator.validateTableNumber(tableNumber);
            return Integer.parseInt(tableNumber);
        } catch (IllegalArgumentException iae) {
            System.out.println(ERROR_PREFIX + iae.getMessage());
            return inputTableNumber();
        }
    }

    public static int inputPayMethod(int tableNumber) {
        System.out.println("## " + tableNumber + "번 테이블의 결제를 진행합니다");
        System.out.println("## 신용카드는 1번 현금은 2번");
        String payMethod = scanner.nextLine().trim();
        try {
            InputValidator.validatePayMethod(payMethod);
            return Integer.parseInt(payMethod);
        } catch (IllegalArgumentException iae) {
            System.out.println(ERROR_PREFIX +  iae.getMessage());
            return inputPayMethod(tableNumber);
        }
    }
}
