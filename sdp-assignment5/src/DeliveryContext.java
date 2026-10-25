import java.util.Objects;

public class DeliveryContext {
    private DeliveryStrategy strategy;

    public DeliveryContext(DeliveryStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "Strategy cannot be null");
    }

    public double executeCalculation(double weightKg, double distanceKm) {
        return strategy.calculateCost(weightKg, distanceKm);
    }
}