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
}
