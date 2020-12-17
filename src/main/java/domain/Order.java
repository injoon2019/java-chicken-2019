package domain;

import java.util.HashMap;
import java.util.Iterator;

public class Order {

    private static final int CHIKEN_DISCOUNT_NUMBER = 10;
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

    public int getChickenCount() {
        int chickenCount = 0;
        Iterator<Integer> keys = menuMap.keySet().iterator();
        while (keys.hasNext()) {
            int menuNumber = (int)keys.next();
            int amount = menuMap.get(menuNumber);
            Category category = MenuRepository.getCategory(menuNumber);
            if (category == Category.CHICKEN) {
                chickenCount += amount;
            }
        }
        return chickenCount;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        Iterator<Integer> keys = menuMap.keySet().iterator();
        while (keys.hasNext()) {
            int menuNumber = (int)keys.next();
            int amount = menuMap.get(menuNumber);
            int price = MenuRepository.getPrice(menuNumber);
            totalPrice = price * amount;
        }
        return totalPrice;
    }
}