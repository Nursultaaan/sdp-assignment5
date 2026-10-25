public class DroneDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double weightKg, double distanceKm) {
        return 25.0 + (weightKg * 5.0) + (distanceKm * 2.5);
    }
}