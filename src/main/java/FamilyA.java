public class FamilyA implements Family {

    @Override
    public int cost(int hour) {
        if (hour < Hours.elevenPM()) {
            return 15;
        } else
            return 20;
    }
}
