package controller;

import domain.Menu;
import domain.Table;
import java.util.List;
import view.InputView;
import view.OutputView;

public class OrderSystem {
    private final List<Table> tables;
    private final List<Menu> menus;

    public OrderSystem(List<Table> tables, List<Menu> menus) {
        this.tables = tables;
        this.menus  = menus;
    }

    public void run() {
        OutputView.printTables(tables);
        int tableNumber = InputView.inputTableNumber();
        OutputView.printMenus(menus);
        int menuNumber =
    }
}
