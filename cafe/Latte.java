package cafe;

public class Latte extends CaffeineBeverage {
    int cost;

    public Latte(boolean milk, String size) {
        super(milk, size);
        if(this.size == Beverage.SMALL){
            this.sizeInt = 5;
        }else if (this.size == Beverage.MEDIUM){
            this.sizeInt = 6;
        }else if (this.size == Beverage.LARGE){
            this.sizeInt = 7;
        }
        setCost();
        setName();
    }

    @Override
    protected void setName() {
        this.name = "Latte";
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setCost() {
        if(this.milk)
            cost = (cost+1) + this.sizeInt;
        else
            cost = this.sizeInt;
    }

    public boolean hasMilk(){
        return this.milk;
    }

    @Override
    public int cost() {
        return this.cost;

    }
}
