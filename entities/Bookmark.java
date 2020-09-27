package entities;

public abstract class Bookmark {

    
    private long id;
    private String title;
    private String profileUrl;

    public long getId()
    {
        return id;
    }
    
    public void setId(long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getProfilUrl()
    {
        return profileUrl;
    }

    public void setProfilUrl(String profileUrl)
    {
        this.profileUrl = profileUrl;
    }

    public abstract boolean isKidFriendlyEligibe();

    @Override
    public String toString() {
        return "Bookmark [id=" + id + ", profileUrl=" + profileUrl + ", title=" + title + "]";
    }
}
