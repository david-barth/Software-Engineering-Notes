package strategy;

public class NormalStrategy implements DiscountStrategy {

    @Override
    public Double applyDiscount(Double normalPrice) {
        return normalPrice;
    }
}
