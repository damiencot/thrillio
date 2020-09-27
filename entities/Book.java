package entities;

import java.util.Arrays;

public class Book extends Bookmark {

    private int publicateYear;
    private String publisher;
    private String[] authors;
    private String genre;
    private double amazonRating;

    public int getPublicateYear() {
        return publicateYear;
    }

    public void setPublicateYear(int publicateYear) {
        this.publicateYear = publicateYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getAmazonRating() {
        return amazonRating;
    }

    public void setAmazonRating(double amazonRating) {
        this.amazonRating = amazonRating;
    }

    @Override
    public String toString() {
        return "Book [amazonRating=" + amazonRating + ", authors=" + Arrays.toString(authors) + ", genre=" + genre
                + ", publicateYear=" + publicateYear + ", publisher=" + publisher + "]";
    }

    @Override
    public boolean isKidFriendlyEligibe() {
        // TODO Auto-generated method stub
        return false;
    }

    
}
