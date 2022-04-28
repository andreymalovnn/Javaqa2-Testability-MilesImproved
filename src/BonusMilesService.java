public class BonusMilesService {
    public int calculate (int cost) {
        int mileQuote = 20;
        int miles = cost / mileQuote;
        return miles;
    }
}
