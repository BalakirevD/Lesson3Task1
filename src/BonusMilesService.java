public class BonusMilesService {
    public int calculate(int price) {
        int mileCoast = 20;
        int miles = price / mileCoast;

        return miles;
    }