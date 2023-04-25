import classes.PalindromeCounter;
import classes.ShortWordCounter;
import classes.UniqueCharCounter;

public class Main {
    public static void main(String[] args) {
//        //1
//        System.out.println(new ShortWordCounter().count("Java is great language", 2));
//
//        //2
//        System.out.println(new ShortWordCounter().count("Java is great language", 4));
//
//        //3
//        System.out.println(new ShortWordCounter().count("Java is great language", 5));
//
//        //4
//        System.out.println(new ShortWordCounter().count("Java is great language", 100));

//        PalindromeCounter counter = new PalindromeCounter();
//
//        //1
//        System.out.println(counter.count("Level done!"));
//
//        //0
//        System.out.println(counter.count("No palindromes"));

        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
