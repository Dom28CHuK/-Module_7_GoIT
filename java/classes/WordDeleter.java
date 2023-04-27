package classes;

public class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] phraseArray = phrase.split(" ");
        String result = "";
        for (int i = 0; i < phraseArray.length; i++) {
            String currentWord = phraseArray[i];
            boolean isWordToRemove = false;
            for (int j = 0; j < words.length; j++) {
                if (currentWord.equals(words[j])) {
                    isWordToRemove = true;
                    break;
                }
            }
            if (!isWordToRemove) {
                result += currentWord + " ";
            }
        }
        return result.trim();
    }
}
