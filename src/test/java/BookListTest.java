import Dao.Impl.BelongingsDao;
import Dao.Impl.BookListDao;
import Entity.Belongings;
import Entity.BookClass;
import Entity.BookList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BookListTest {

    BookListDao book = new BookListDao();
    BelongingsDao belong =new BelongingsDao();
    @Test
    public void Login(){
        BookList b = new BookList();
        b.setBookName("1");
        b.setBookPrice(23);

        List<BookClass> BookClassList = new ArrayList<>();
        BookClass class1=new BookClass();
        BookClass class2=new BookClass();
        class1.setBookClass("通识教育");
        class1.setBook(b);
        class2.setBookClass("思政");
        class2.setBook(b);
        BookClassList.add(class1);
        BookClassList.add(class2);
        b.setClasslist(BookClassList);

        book.save(b);
    }

    @Test
    public void updateBookInfo(){
        BookList b = book.getOne(2L);
        b.setBookPrice(25);
        book.update(b);
    }

    @Test
    public void deleteBookInfo(){
        book.delete(16L);
    }

    @Test
    public void findBookList(){
        BookList b = book.getOne(2L);
        System.out.println(b.getBookName());
    }

    @Test
    public void findPerson(){
        Belongings person=new Belongings();
        person.setStuName("小明");

        List<BookList> bookl = new ArrayList<>();
        BookList book1=book.getOne(2L);
        BookList book2=book.getOne(3L);
        book1.setPerson(person);
        book2.setPerson(person);
        bookl.add(book1);
        //bookl.add(book2);
        person.setBook(bookl);

        belong.save(person);
    }
}
