package classes;

public class BigOrSmall {
    public String calculate(String text) {
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                upperCaseCount++;
            }
        }
        if (lowerCaseCount > upperCaseCount) {
            return "Small";
        } else if (upperCaseCount > lowerCaseCount) {
            return "Big";
        } else {
            return "Same";
        }
    }
}
