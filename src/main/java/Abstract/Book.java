package Abstract;

/**
 * Created by ramon on 12-01-16.
 */
public abstract class Book {
    String title;
    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}
