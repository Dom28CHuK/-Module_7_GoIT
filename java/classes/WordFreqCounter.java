package classes;

public class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        phrase = phrase.toLowerCase();
        word = word.toLowerCase();

        String[] words = phrase.split(" ");

        int count = 0;

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        float freq = (float) count / words.length;

        return freq;
    }
}
