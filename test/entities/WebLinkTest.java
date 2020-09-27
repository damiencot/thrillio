package test.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import entities.WebLink;
import managers.BookmarkManager;

public class WebLinkTest {

    @Test 
    public void testIsKidFriendlyElidible() {
        //Test 1 - word Porn in url
        WebLink webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",	"http://www.javaworld.com");
        boolean isKidFriendlyEligible = webLink.isKidFriendlyEligibe();
        assertFalse("porn in url - return false", isKidFriendlyEligible);

        //Test 2 - word Porn in title
        webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",	"http://www.javaworld.com");
        isKidFriendlyEligible = webLink.isKidFriendlyEligibe();
        assertFalse("porn in title - return false", isKidFriendlyEligible);

        //Test 3 - word adult in host
        webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming tiger, Part 2",	"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",	"http://www.adult.com");
        isKidFriendlyEligible = webLink.isKidFriendlyEligibe();
        assertFalse("adult in host - return false", isKidFriendlyEligible);
    }

    
}
