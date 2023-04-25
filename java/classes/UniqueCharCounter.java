package classes;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharCounter {
    public int count(String phrase) {
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (Character.isLetterOrDigit(c) || c == ' ') {
                uniqueChars.add(c);
            }
        }
        return uniqueChars.size();
    }
}
