package domain;

import java.util.HashMap;

public class Order {

    private HashMap<Integer, Integer> menuMap;

    public Order(){
        this.menuMap = new HashMap<>();
    }

    public boolean addOrder(int menuNumber, int menuAmount) {
        if (menuMap.containsKey(menuNumber)) {
            menuMap.put(menuNumber, menuMap.get(menuNumber) + menuAmount);
            return true;
        }
        menuMap.put(menuNumber, menuAmount);
        return true;
    }
}