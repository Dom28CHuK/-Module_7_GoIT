package classes;

import java.util.Arrays;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        sourceWord = sourceWord.toLowerCase();
        targetWord = targetWord.toLowerCase();

        char[] sourceChars = sourceWord.toCharArray();
        char[] targetChars = targetWord.toCharArray();

        boolean[] sourceCharAvailable = new boolean[sourceChars.length];
        Arrays.fill(sourceCharAvailable, true);

        for (char targetChar : targetChars) {
            boolean charFound = false;

            for (int i = 0; i < sourceChars.length; i++) {
                if (sourceCharAvailable[i] && sourceChars[i] == targetChar) {
                    sourceCharAvailable[i] = false;
                    charFound = true;
                    break;
                }
            }
            if (!charFound) {
                return false;
            }
        }
        return true;
    }
}
