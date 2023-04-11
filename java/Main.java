import classes.Phrase;
import classes.WordSplitter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String[] words = {"alpha", "beta", "gamma"};
//
//        Phrase phrase = new Phrase(words);
//
//        //alpha beta gamma
//        System.out.println(phrase);
//
//        words[0] = "zero";
//
//        //alpha beta gamma
//        System.out.println(phrase);

        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
