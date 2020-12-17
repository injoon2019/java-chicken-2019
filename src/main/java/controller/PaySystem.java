package controller;

import domain.Menu;
import domain.Table;
import java.util.List;
import view.InputView;
import view.OutputView;

public class PaySystem {

    private final List<Table> tables;
    private final List<Menu> menus;

    public PaySystem(List<Table> tables, List<Menu> menus) {
        this.tables = tables;
        this.menus  = menus;
    }

    public void run() {
        OutputView.printTablesToPay(tables);
        int tableNumber = InputView.inputTableNumber();
        OutputView.printOrders(tables, tableNumber);
    }
}
