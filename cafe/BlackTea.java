package cafe;

public class BlackTea extends TeaBeverage {
    int cost;

    public BlackTea(boolean lemon, String size) {
        super(lemon,size);
        if(this.size == Beverage.SMALL){
            this.sizeInt = 3;
        }else if(this.size == Beverage.MEDIUM){
            this.sizeInt = 4;
        }else if (this.size == Beverage.LARGE){
            this.sizeInt = 5;
        }
        setCost();
        setName();
    }

    @Override
    protected void setName() {
        this.name = "Black Tea";
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setCost() {
        if(this.lemon)
            cost = (cost+1) + this.sizeInt;
        else
            cost = this.sizeInt;
    }

    public boolean hasLemon(){
        return this.lemon;
    }

    @Override
    public int cost() {
        return this.cost;

    }
}
