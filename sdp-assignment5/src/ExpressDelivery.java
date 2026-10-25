public class ExpressDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return 15.0 + (weightKg * 3.0) + (distanceKm * 1.2);
    }
}