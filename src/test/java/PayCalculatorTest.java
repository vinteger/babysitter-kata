import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PayCalculatorTest {

    private PayCalculator payCalculator;
    private Family family;

    @Test
    public void worksZeroHours_totalPayIsZero() {
        payCalculator = new PayCalculator(Hours.fivePM(), Hours.fivePM());
        family = new FamilyA();

        assertEquals(0, payCalculator.calculate(family));
    }

    @Test
    public void works5to11FamilyA_totalPayIs90() {
        payCalculator = new PayCalculator(Hours.fivePM(), Hours.elevenPM());
        family = new FamilyA();

        assertEquals(90, payCalculator.calculate(family));
    }

    @Test
    public void works11to4FamilyA_totalPayIs100() {
        payCalculator = new PayCalculator(Hours.elevenPM(), Hours.fourAM());
        family = new FamilyA();

        assertEquals(100, payCalculator.calculate(family));

    }

    @Test
    public void works10to12FamilyA_totalPayIs35() {
        payCalculator = new PayCalculator(Hours.tenPM(), Hours.twelveAM());
        family = new FamilyA();

        assertEquals(35, payCalculator.calculate(family));
    }

    @Test
    public void works5to4FamilyA_totalPayIs190() {
        payCalculator = new PayCalculator(Hours.fivePM(), Hours.fourAM());
        family = new FamilyA();

        assertEquals(190, payCalculator.calculate(family));
    }

    @Test
    public void works5to6FamilyB_totalPayIs12() {
        payCalculator = new PayCalculator(Hours.fivePM(), Hours.sixPM());
        family = new FamilyB();

        assertEquals(12, payCalculator.calculate((family)));
    }

    @Test
    public void works10to12FamilyB_totalPayIs16() {
        payCalculator = new PayCalculator(Hours.tenPM(), Hours.twelveAM());
        family = new FamilyB();

        assertEquals(16, payCalculator.calculate(family));
    }

    @Test
    public void works12to4FamilyB_totalPayIs64() {
        payCalculator = new PayCalculator(Hours.twelveAM(), Hours.fourAM());
        family = new FamilyB();

        assertEquals(64, payCalculator.calculate(family));
    }

    @Test
    public void works11to1FamilyB_totalPayIs24() {
        payCalculator = new PayCalculator(Hours.elevenPM(), Hours.oneAM());
        family = new FamilyB();

        assertEquals(24, payCalculator.calculate(family));
    }

    @Test
    public void works5to9FamilyC_totalPayIs84() {
        payCalculator = new PayCalculator(Hours.fivePM(), Hours.ninePM());
        family = new FamilyC();

        assertEquals(84, payCalculator.calculate(family));
    }

    @Test
    public void works9to3FamilyC_totalPayIs90() {
        payCalculator = new PayCalculator(Hours.ninePM(), Hours.threeAM());
        family = new FamilyC();

        assertEquals(90, payCalculator.calculate(family));
    }

    @Test
    public void works8to11FamilyC_totalPayIs51() {
        payCalculator = new PayCalculator(Hours.eightPM(), Hours.elevenPM());
        family = new FamilyC();

        assertEquals(51, payCalculator.calculate(family));
    }
}
