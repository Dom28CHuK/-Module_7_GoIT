import classes.DigitText;
import classes.SensitiveDataSearcher;
import classes.SummaryCreator;
import classes.WordDeleter;

public class Main {
    public static void main(String[] args) {
//        WordDeleter wordDeleter = new WordDeleter();
//
//        //Hello
//        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));
//
//        //This Sparta
//        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));

//        SensitiveDataSearcher searcher = new SensitiveDataSearcher();
//
//        //false
//        System.out.println(searcher.isSensitiveDataPresent("Hello world"));
//
//        //true
//        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));

//        //true
//        System.out.println(new DigitText().detect("23 50"));
//
//        //false
//        System.out.println(new DigitText().detect("Year 1990"));

        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}
