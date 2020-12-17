package view;

import domain.Menu;
import domain.Table;

import java.util.List;

public class OutputView {

    private static final String TOP_LINE = "┌ ─ ┐";
    private static final String TABLE_FORMAT = "| %s |";
    private static final String BOTTOM_LINE = "└ ─ ┘";
    private static final String BOTTOM_LINE_AFTER_ORDER = "└ $ ┘";
    private static final String MAIN_TITLE = "##메인화면";
    private static final String REGISTER_ORDER_OPTION = "1 - 주문등록";
    private static final String PAY_OPTION = "2 - 결제하기";
    private static final String TURN_OFF_OPTION = "3 - 프로그램 종료";

    public static void printTables(final List<Table> tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printLine(BOTTOM_LINE, size);
    }

    public static void printMenus(final List<Menu> menus) {
        for (final Menu menu : menus) {
            System.out.println(menu);
        }
    }

    private static void printLine(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
        System.out.println();
    }

    private static void printLineToPay(final String line, final int count) {
        for (int index = 0; index < count; index++) {
            System.out.print(line);
        }
    }

    private static void printTableNumbers(final List<Table> tables) {
        for (final Table table : tables) {
            System.out.printf(TABLE_FORMAT, table);
        }
        System.out.println();
    }

    public static void printMainScreen() {
        System.out.println(MAIN_TITLE);
        System.out.println(REGISTER_ORDER_OPTION);
        System.out.println(PAY_OPTION);
        System.out.println(TURN_OFF_OPTION);
        System.out.println();
    }

    public static void printTablesToPay(final List<Table> tables) {
        System.out.println("## 테이블 목록");
        final int size = tables.size();
        printLine(TOP_LINE, size);
        printTableNumbers(tables);
        printBottomLineToPay(tables, BOTTOM_LINE);
    }

    public static void printBottomLineToPay(List<Table> tables, final String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Table table : tables) {
            if (table.hasOrder()) {
                stringBuilder.append(BOTTOM_LINE_AFTER_ORDER);
                continue;
            }
            stringBuilder.append(BOTTOM_LINE);
        }
        System.out.println(stringBuilder.toString());
        System.out.println();
    }

    public static void printOrders(List<Table> tables, int tableNumber) {
        for (Table table : tables) {
            if (table.isSameNumber(tableNumber)) {
                table.printOrders();
            }
        }
    }

    public static void printFinalPrice(int price) {
        System.out.println("## 최종 결제할 금액");
        System.out.println(price + "원");
        System.out.println();
    }
}
