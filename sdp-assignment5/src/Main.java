public class Main {
    public static void main(String[] args) {
        double weight = 4.0;
        double distance = 12.5;

        DeliveryContext context = new DeliveryContext(new StandardDelivery());
        System.out.println("Standard delivery cost: " + context.executeCalculation(weight, distance));

        context.setStrategy(new ExpressDelivery());
        System.out.println("Express delivery cost: " + context.executeCalculation(weight, distance));

        context.setStrategy(new DroneDelivery());
        System.out.println("Drone delivery cost: " + context.executeCalculation(weight, distance));
    }
}