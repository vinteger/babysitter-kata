import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayCalculatorTest {

    private PayCalculator payCalculator;

    @Test
    public void worksZeroHours_totalPayIsZero() {
        payCalculator = new PayCalculator(Hours.fivePM(), Hours.fivePM());
        Family familyA = new Family('A');

        assertEquals(0, payCalculator.calculate(familyA));
    }

    @Test
    public void works5to11FamilyA_totalPayIs90() {
        payCalculator = new PayCalculator(Hours.fivePM(), Hours.elevenPM());
        Family familyA = new Family('A');

        assertEquals(90, payCalculator.calculate(familyA));
    }

    @Test
    public void works11to4FamilyA_totalPayIs100() {
        payCalculator = new PayCalculator(Hours.elevenPM(), Hours.fourAM());
        Family familyA = new Family('A');

        assertEquals(100, payCalculator.calculate(familyA));

    }

    @Test
    public void works10to12FamilyA_totalPayIs35() {
        payCalculator = new PayCalculator(Hours.tenPM(), Hours.twelveAM());
        Family familyA = new Family('A');

        assertEquals(35, payCalculator.calculate(familyA));
    }

    @Test
    public void works5to4FamilyA_totalPayIs190() {
        payCalculator = new PayCalculator(Hours.fivePM(), Hours.fourAM());
        Family familyA = new Family('A');

        assertEquals(190, payCalculator.calculate((familyA)));
    }
}
