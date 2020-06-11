package cafe;

public abstract class Beverage {
    public static int cost;
    public static String SMALL = "Small";
    public static String MEDIUM = "Medium";
    public static String LARGE = "Large";

    public  String name;
    public String size;
    public boolean milkLemon;

    public Beverage(boolean milkLemon,String size) {
        this.size = size;
        this.milkLemon = milkLemon;
        setName();
    }

    protected abstract void setName();
    public abstract String getName();

    public int   cost(){
        return cost;
    }

    public abstract  boolean hasMilk();
    public abstract  boolean hasLemon();
}
