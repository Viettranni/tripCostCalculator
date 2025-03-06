

import java.util.Scanner;

public class TripCostCalculator {
    
    public static double calculateTotalCost(double travelDistance, double pricePerLiter, double fuelConsumption) {
        double totalFuelNeeded = (travelDistance / 100) * fuelConsumption;

        double totalCost = totalFuelNeeded * pricePerLiter;
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed fuel consumption
        double fuelConsumption = 5;

        // Travel Distance
        System.out.println("What is your travel distance (km)? ");
        double travelDistance = scanner.nextDouble();

        // Fuel Price per Liter
        System.out.println("What is the Fuel Price per Liter (€)? ");
        double pricePerLiter = scanner.nextDouble();

        double totalCost = calculateTotalCost(travelDistance, pricePerLiter, fuelConsumption);

        System.out.println("The total price for this Trip is: " + totalCost + " €!");

        scanner.close();

    }


}
