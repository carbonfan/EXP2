package Entity;

import javax.persistence.*;

@Entity
public class BookClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long BookId;
    private String BookClass;

    public BookClass(){

    }

    public BookList getBook() {
        return book;
    }

    public void setBook(BookList book) {
        this.book = book;
    }

    public Long getBookId() {
        return BookId;
    }

    public void setBookId(Long bookId) {
        BookId = bookId;
    }

    public String getBookClass() {
        return BookClass;
    }

    public void setBookClass(String bookClass) {
        BookClass = bookClass;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="book_id")
    private BookList book;
}
