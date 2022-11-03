package Entity;

import javax.persistence.*;
import java.util.List;

@Entity//和数据库中的表建立关联关系
public class BookList {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)//MySQL自增主键
    @Column(name = "BookNo")//映射数据库中BookNo
    private Long BookNo;
    private String BookName;
    private String BookClass;
    private int BookPrice;


    @OneToMany(mappedBy = "book",cascade=CascadeType.ALL,fetch = FetchType.LAZY)//声明关系
    //当进行BookList改变时，BookList关联类也会随之改变。懒加载会在想要获取某数据时才访问数据库

    private List<BookClass> classlist;

    public List<BookClass> getClasslist() {
        return classlist;
    }

    public void setClasslist(List<BookClass> classlist) {
        this.classlist = classlist;
    }

    public Long getBookNo() {
        return BookNo;
    }

    public void setBookNo(Long bookNo) {
        BookNo = bookNo;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int bookPrice) {
        BookPrice = bookPrice;
    }

    public String getBookClass() {
        return BookClass;
    }

    public Belongings getPerson() {
        return person;
    }

    public void setPerson(Belongings person) {
        this.person = person;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="stu_id")
    private Belongings person;
}
