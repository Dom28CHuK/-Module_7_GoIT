package classes;

import java.util.Locale;

public class SensitiveDataSearcher {

    private static final String[] SENSITIVE_WORDS = {"pass", "key", "login", "email"};
    public boolean isSensitiveDataPresent(String phrase) {
        phrase = phrase.toLowerCase();
        for (String word : SENSITIVE_WORDS) {
            if (phrase.contains(word)) {
                return true;
            }
        }
        return false;
    }
}
