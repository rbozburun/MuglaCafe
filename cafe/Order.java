package cafe;

import java.util.ArrayList;

public class Order {
    int totalCost = 0;
    public ArrayList<OrderItem> orderList = new ArrayList<OrderItem>();

    public void add(OrderItem orderItem) {
        orderList.add(orderItem);
    }

    public int totalCost(){
        for(int i = 0; i<orderList.size(); i++){
            totalCost += orderList.get(i).cost();

        }
        return totalCost;
    }

    @Override
    public String toString() {
        totalCost();
        String orderStr = "------------------ CHECK ------------------ \n";
        boolean isMilk;
        boolean hasMilk;
        boolean hasLemon;

        for(int i = 0; i<orderList.size(); i++) {
            orderStr += orderList.get(i).amount + " " + orderList.get(i).beverage.size+ " " + orderList.get(i).beverage.getName();
            isMilk = orderList.get(i).beverage.getClass().getName() == "cafe.Latte" || orderList.get(i).beverage.getClass().getName() == "cafe.Americano" || orderList.get(i).beverage.getClass().getName() == "cafe.Cappucino";
            hasMilk = orderList.get(i).beverage.hasMilk();
            hasLemon = orderList.get(i).beverage.hasLemon();
            if(isMilk){
                orderStr += hasMilk ? " with Milk ":" without Milk ";
            }else{
                orderStr += hasLemon ? " with Lemon ":" without Lemon ";
            }
            orderStr += " "+ orderList.get(i).cost()+ " TL \n";
        }
        orderStr+="--------\n";
        orderStr+="| TOTAL: "+totalCost+" TL \n";
        orderStr+="--------------------------------------------";

        return orderStr;
    }
}
