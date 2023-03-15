package strategy;

public class HappyHourStrategy implements DiscountStrategy{


    @Override
    public Double applyDiscount(Double normalPrice) {
        return normalPrice * 0.8;
    }
}
