
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TripCostCalculatorTest {
    @Test
    void testCalculateTotalCost() {
        double calcualtedTotalCost = TripCostCalculator.calculateTotalCost(400, 1.89, 5);
        
        assertEquals(37.8, calcualtedTotalCost);
    }
}
