package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Belongings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String StuName;

    @OneToMany(mappedBy = "person",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    private List<BookList> book;

    public List<BookList> getBook() {
        return book;
    }

    public void setBook(List<BookList> book) {
        this.book = book;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        Id = Id;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }
}
