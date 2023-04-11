package classes;

public class PunctuationMarkCounter {
    public int count(String phrase) {
        int count = 0;
        for (char c : phrase.toCharArray()) {
            if (c == '.' || c == ',' || c == '!' || c == ':' || c == ';') {
                count++;
            }
        }
        return count;
    }
}
