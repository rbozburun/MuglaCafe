package cafe;

public class Americano extends CaffeineBeverage{
    int cost;

    public Americano(boolean milk,String size){
        super(milk, size);
        if(this.size == Beverage.SMALL){
            this.sizeInt = 7;
        }else if (this.size == Beverage.MEDIUM){
            this.sizeInt = 8;
        }else if (this.size == Beverage.LARGE){
            this.sizeInt = 9;
        }
        setCost();
        setName();
    }

    @Override
    protected void setName() {
        this.name = "Americano";
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
