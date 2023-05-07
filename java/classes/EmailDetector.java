package classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDetector {
    public boolean isPresent(String text) {
        String regex = "\\S{2,}@\\S{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
