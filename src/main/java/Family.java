public class Family {

    private int[] rates;

    public Family(char name) {
        if (name == 'A') {
            rates = new int[2];
            rates[0] = 15;
            rates[1] = 20;
        }
    }

    public int cost(int hour) {
        if (hour < 7) {
            return rates[0];
        } else
            return rates[1];
    }
}
