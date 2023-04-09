import classes.GooSearchResult;
import classes.GooWordStat;

public class Main {
    public static void main(String[] args) {
//        //Word is [human], search freq is LOW
//        System.out.println(new GooWordStat("human", 10));
//
//        //Word is [mars], search freq is MEDIUM
//        System.out.println(new GooWordStat("mars", 10000));
//
//        //Word is [space], search freq is HIGH
//        System.out.println(new GooWordStat("space", 9965499));
//
//        //Word is [life], search freq is EXTRA HIGH
//        System.out.println(new GooWordStat("life", 564785654));

        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
