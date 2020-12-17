package controller;

import domain.Menu;
import domain.MenuRepository;
import domain.Table;
import domain.TableRepository;
import java.util.List;
import view.InputView;
import view.OutputView;

public class PosSystem {

    private static final String OPTION_ONE = "1";
    private static final String OPTION_TWO = "2";
    private static final String OPTION_THREE = "3";

    private final List<Table> tables;
    private final List<Menu> menus;
    private String userOption = "";
    private OrderSystem orderSystem;

    public PosSystem() {
        tables = TableRepository.tables();
        menus = MenuRepository.menus();
        orderSystem = new OrderSystem(tables, menus);
    }

    public void run() {
        while (!userOption.equals(OPTION_THREE)) {
            OutputView.printMainScreen();
            userOption = InputView.askUserOption();
            runUserOption(userOption);
        }

        final List<Menu> menus = MenuRepository.menus();
        OutputView.printMenus(menus);
    }

    private void runUserOption(String userOption) {
        if (userOption.equals(OPTION_ONE)) {
            orderSystem.run();
        }
        if (userOption.equals(OPTION_TWO)) {

        }
    }
}
