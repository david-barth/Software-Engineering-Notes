package strategy;


public interface DiscountStrategy {

    //TODO: Apply Strategy to normal price vs happy discount (/ other discounts)

    Double applyDiscount(Double normalPrice);

    //Note: Enums are good choices for acting as a registry => Can be used with other constructs like Switch statement


}
