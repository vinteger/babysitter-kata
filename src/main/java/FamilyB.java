public class FamilyB implements Family {

    @Override
    public int cost(int hour) {
        if (hour < Hours.tenPM()) {
            return 12;
        } else if (hour < Hours.twelveAM()) {
            return 8;
        } else {
            return 16;
        }
    }
}
