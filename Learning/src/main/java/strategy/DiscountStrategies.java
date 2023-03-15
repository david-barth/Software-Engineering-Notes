package strategy;

import java.util.function.UnaryOperator;

public enum DiscountStrategies implements DiscountStrategy {

    HAPPY_HOUR(price -> price * 0.8),
    NORMAL(price -> price);

    DiscountStrategies(UnaryOperator<Double> discount) {
        this.discount = discount;
    }

    public UnaryOperator<Double> discount;

    @Override
    public Double applyDiscount(Double normalPrice) {
        return this.discount.apply(normalPrice);
    }
}