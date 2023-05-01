package classes;

import java.util.List;

public class DigitExtracter {

    public int[] extract(String text) {
        int digitCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                digitCount++;
            }
        }

        int[] digits = new int[digitCount];

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                digits[index] = Character.getNumericValue(c);
                index++;
            }
        }
        return digits;
    }
}
