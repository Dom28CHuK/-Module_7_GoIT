package classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDetector {
    public boolean isPresent(String text) {
        Pattern pattern = Pattern.compile("xx@xx");
        Matcher matcher = pattern.matcher(" ");
        return matcher.find();
    }
}
