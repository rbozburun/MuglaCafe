package cafe;

public class LindenTea extends TeaBeverage{
    int cost;

    public LindenTea(boolean lemon, String size) {
        super(lemon,size);
        if(this.size == Beverage.SMALL){
            this.sizeInt = 5;
        }else if(this.size == Beverage.MEDIUM){
            this.sizeInt = 6;
        }else if (this.size == Beverage.LARGE){
            this.sizeInt = 7;
        }
        setCost();
        setName();
    }

    @Override
    protected void setName() {
        this.name = "Linden Tea";
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
