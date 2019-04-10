public class FamilyC implements Family {
    @Override
    public int cost(int hour) {
        if (hour < Hours.ninePM()) {
            return 21;
        } else {
            return 15;
        }
    }
}
