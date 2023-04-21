package classes;

public class DoubleSpaceCleaner {
    public String clean(String phrase) {
        phrase = phrase.trim().replaceAll("\\s+", " ");
        return phrase;
    }
}
