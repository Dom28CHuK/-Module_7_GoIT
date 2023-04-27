package classes;

public class MathDetector {
    public boolean isMath(String text) {
        boolean hasEqualSing = text.contains("=");
        boolean hasMathOperator = text.matches(".*[+\\-*/].*");
        boolean hasTwoDigits = text.matches(".*\\d.*\\d.*");

        return hasEqualSing && hasMathOperator && hasTwoDigits;
    }
}
