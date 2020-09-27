package entities;

public class WebLink extends Bookmark{
    
    private String url;
    private String host;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "WebLink [host=" + host + ", url=" + url + "]";
    }

    @Override
    public boolean isKidFriendlyEligibe() {
        if(url.contains("porn") || getTitle().contains("porn") || host.contains("adult"))
        {
            return false;
        }
        return true;
    }
    
}