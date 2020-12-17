package view;

import java.util.Scanner;
import utils.InputValidator;

public class InputView {
    private static final String ERROR_PREFIX = "[ERROR] :";
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputTableNumber() {
        System.out.println("## 주문할 테이블을 선택하세요.");
        return scanner.nextInt();
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
}
