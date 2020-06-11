package cafe;

public class CaffeineBeverage extends Beverage{
    protected String size;
    protected boolean milk;
    protected int sizeInt;

    public CaffeineBeverage(boolean milk,String size){
        super(milk,size);
        this.milk = milk;
        this.size = size;

    }

    @Override
    protected void setName() {
    }

    @Override
    public String getName() {
        return null;
    }

    public boolean hasMilk(){
        return this.milk;
    }

    @Override
    public boolean hasLemon() {
        return false;
    }


}
