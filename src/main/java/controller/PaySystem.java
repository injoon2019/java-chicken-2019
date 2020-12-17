package controller;

import domain.Menu;
import domain.Table;
import java.util.List;
import view.InputView;
import view.OutputView;

public class PaySystem {

    private static final int CHICKEN_DISCOUNT_MIN = 10;
    private static final double CHICKEN_DISCOUNT_RATE = 0.1;
    private static final double PAY_METHOD_DISCOUNT_RATE = 0.05;
    private static final int CASH_METHOD = 2;

    private final List<Table> tables;
    private final List<Menu> menus;

    public PaySystem(List<Table> tables, List<Menu> menus) {
        this.tables = tables;
        this.menus = menus;
    }

    public void run() {
        OutputView.printTablesToPay(tables);
        int tableNumber = InputView.inputTableNumberToPay();
        OutputView.printOrders(tables, tableNumber);
        int payMethod = InputView.inputPayMethod(tableNumber);
        int priceTotal = calculatePriceTotal(tableNumber, payMethod);
        OutputView.printFinalPrice(priceTotal);
    }

    public int calculatePriceTotal(int tableNumber, int payMethod) {
        Table table = getTable(tableNumber);
        int totalPrice = table.getTotalPrice();
        int chickenCount = table.getChickenCount();
        totalPrice = discountChicken(totalPrice, chickenCount);
        totalPrice = discountPayMethod(totalPrice, payMethod);
        clearOrders(table);
        return totalPrice;
    }

    public int discountChicken(int totalPrice, int chickenCount) {
        if (chickenCount > CHICKEN_DISCOUNT_MIN) {
            return (int) (totalPrice * (1 - CHICKEN_DISCOUNT_RATE));
        }
        return totalPrice;
    }

    public void clearOrders(Table table) {
        table.clearOrder();
    }

    public int discountPayMethod(int totalPrice, int payMethod) {
        if (payMethod == CASH_METHOD) {
            return (int) (totalPrice * (1 - PAY_METHOD_DISCOUNT_RATE));
        }
        return totalPrice;
    }

    public Table getTable(int tableNumber) {
        for (Table table : tables) {
            if (table.isSameNumber(tableNumber)) {
                return table;
            }
        }
        return null;
    }
}