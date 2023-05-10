package classes;

public class GooWordStat {
    private final String word;
    private final int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }

    public String freqValidate() {
        if (freq < 1000) {
            return "LOW";
        } else if (freq >= 1000 && freq < 100000) {
            return "MEDIUM";
        } else if (freq >= 100000 && freq < 10000000) {
            return "HIGH";
        } else {
            return "EXTRA HIGH";
        }
    }

    @Override
    public String toString() {
        return "Word is " + word + ", search freq is " + freqValidate();
    }
}
