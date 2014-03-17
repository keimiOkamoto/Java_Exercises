import java.util.Set;

public class WebPageImpl implements WebPage {
    private String url;
    private Set<String> links;
    private Set<String> emails;

    /**
     * Constructor for WebPageImpl
     *
     * @param url of webPage
     */
    public WebPageImpl(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public Set<String> getLinks() {
        return links;
    }

    @Override
    public Set<String> getEmails() {
        return emails;
    }


}
