package classes;

public class DigitText {
    public boolean detect(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(!Character.isDigit(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
}
