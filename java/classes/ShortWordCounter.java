package classes;

public class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int count = 0;

        String[] words = phrase.split(" ");

        for (String word : words) {
            if (word.length() <= minLength) {
                count++;
            }
        }
        return count;
    }
}
