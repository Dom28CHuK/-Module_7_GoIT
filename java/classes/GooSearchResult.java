package classes;

public class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String domain = "";
        if (url.startsWith("http://")) {
            domain = url.substring(7);
        } else if (url.startsWith("https://")) {
            domain = url.substring(8);
        }
        int slashIndex = domain.indexOf('/');
        if (slashIndex != -1) {
            domain = domain.substring(0, slashIndex);
        }
        return domain;
    }
}
