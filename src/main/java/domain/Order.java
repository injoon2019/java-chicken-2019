package domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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

    public boolean isOrdered() {
        return !menuMap.isEmpty();
    }

    @Override
    public String toString() {
        String result = "";
        Iterator<Integer> keys = menuMap.keySet().iterator();
        while (keys.hasNext()) {
            int menuNumber = (int)keys.next();
            String menuName = MenuRepository.getMenuName(menuNumber);
            int amount = menuMap.get(menuNumber);
            int price = MenuRepository.getPrice(menuNumber);
            result += menuName + " " + amount + " " + price;
        }
        return result;
    }
}