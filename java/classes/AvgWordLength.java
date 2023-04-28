package classes;

public class AvgWordLength {
    public double count(String phrase) {
        String[] words = phrase.split(" ");
        int wordCount = words.length;
        int charCount = 0;
        for (String word : words) {
            charCount += word.length();
        }

        return (double) charCount / wordCount;
    }
}
