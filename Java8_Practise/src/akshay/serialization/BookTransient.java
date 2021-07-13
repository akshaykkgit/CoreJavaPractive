package akshay.serialization;

import java.io.Serializable;

public class BookTransient implements Serializable{
    private int ISBN;
    private String title;
    private String author; 
    private transient int edition = 1;//transient variable not serialized

    public BookTransient(int ISBN, String title, String author, int edition) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" + "ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", edition=" + edition + '}';
    }
 
}
