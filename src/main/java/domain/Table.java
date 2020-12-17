package domain;

public class Table {

    private final int number;
    private final Order order = new Order();

    public Table(final int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }

    public boolean isSameNumber(int number) {
        return number == this.number;
    }

    public boolean addOrder(int menuNumber, int menuAmount) {
        return order.addOrder(menuNumber, menuAmount);
    }

    public boolean hasOrder() {
        return order.isOrdered();
    }

    public void printOrders() {
        System.out.println("##주문 내역");
        System.out.println("메뉴 수량 금액");
        System.out.println(order);
        System.out.println();
    }

    public int getChickenCount() {
        return order.getChickenCount();
    }

    public int getTotalPrice() {
        return order.getTotalPrice();
    }
}
