package cafe;

public class OrderItem {
    Beverage beverage;
    int amount;

    public OrderItem(Beverage cBeverage, int number) {
        this.beverage = cBeverage;
        this.amount = number;
    }

    int cost(){
        return this.beverage.cost()*this.amount;
    }
}
