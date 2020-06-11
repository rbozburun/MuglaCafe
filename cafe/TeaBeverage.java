package cafe;

public class TeaBeverage extends  Beverage{
    protected String size;
    protected boolean lemon;
    protected int sizeInt;

    public TeaBeverage(boolean lemon,String size){
        super(lemon,size);
        this.lemon = lemon;
        this.size = size;
    }

    @Override
    protected void setName() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean hasMilk() {
        return false;
    }

    public boolean hasLemon(){
        return this.lemon;
    }
}
