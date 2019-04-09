
public class PayCalculator {
    private int startTime;
    private int endTime;

    public PayCalculator(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int calculate(Family family) {
        int totalCost = 0;

        for (int i = startTime; i < endTime; i++) {
            totalCost += family.cost(i);
        }

        return totalCost;
    }
}
