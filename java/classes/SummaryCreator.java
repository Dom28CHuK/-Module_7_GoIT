package classes;

public class SummaryCreator {
    public String create(String text) {
        if (text.length() <= 15) {
            return text;
        } else {
            String summary = text.substring(0, 15);
            if (text.charAt(15) != ' ') {
                summary += "...";
            }
            return summary;
        }
    }
}
