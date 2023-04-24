package classes;

public class PalindromeCounter {
    public int count(String phrase) {
        int palindromeCount = 0;
        String[] words = phrase.split(" ");
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            String reversedWord = new StringBuilder(lowerCaseWord).reverse().toString();
            if (lowerCaseWord.equals(reversedWord)) {
                palindromeCount++;
            }
        }
        return palindromeCount;
    }
}
