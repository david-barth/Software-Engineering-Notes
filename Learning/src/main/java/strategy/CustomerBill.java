package strategy;

public class CustomerBill {

    public CustomerBill(double total, DiscountStrategy discountStrategy) {
        this.total = total;
        this.discountStrategy = discountStrategy;
    }

    private double total;
    public DiscountStrategy discountStrategy;

    public double getTotal() {
        return discountStrategy.applyDiscount(total);
    }

}
