package classes;

public class WaterCounter {
    public double count(String text) {
        int totalCharacters = text.length();
        int spaceCount = 0;

        for (int i = 0; i < totalCharacters; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        return (double) spaceCount / totalCharacters;
    }
}
