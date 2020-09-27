package dao;

import entities.Bookmark;
import entities.UserBookmark;
import thrillio.DataStore;

public class BookmarkDao {

    public Bookmark[][] getBookmarks()
    {
        return DataStore.getBookmarks();
    }

	public void saveUserBookmark(UserBookmark userBookmark) {
        DataStore.add(userBookmark);
	}
}