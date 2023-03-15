package strategy;

import java.util.HashMap;
import java.util.Map;

import static strategy.DiscountStrategies.HAPPY_HOUR;
import static strategy.DiscountStrategies.NORMAL;

public class StrategyMain {

    //TODO: Create strategy for computing the area of a shape:

//    static Map<String, DiscountStrategy> strategies = getStrategyMap();
//
//
//    public static Map<String, DiscountStrategy> getStrategyMap() {
//        Map<String, DiscountStrategy> strategies = new HashMap<>();
//        strategies.put("Happy Hour", new HappyHourStrategy());
//        strategies.put("Normal", new NormalStrategy());
//
//        return strategies;
//    }

    public static void main(String[] args) {
        String situation = "Happy Hour";

        DiscountStrategy chosenStrategy = situation.equals("Happy Hour") ? HAPPY_HOUR : NORMAL;

        CustomerBill cb =  new CustomerBill(10d, chosenStrategy);
        System.out.println(cb.getTotal());

    }


}
