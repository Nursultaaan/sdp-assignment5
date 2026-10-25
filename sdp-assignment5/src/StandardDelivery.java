public class StandardDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return 5.0 + (weightKg * 1.5) + (distanceKm * 0.5);
    }
}