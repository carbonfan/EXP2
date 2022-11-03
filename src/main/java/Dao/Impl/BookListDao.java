package Dao.Impl;

import Entity.BookList;
import Util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class BookListDao extends BaseDao<BookList> implements IsBookListDao{
    public boolean Login(String name){
        EntityManager manager= JPAUtil.getEntityManager();
        String hql ="select b from BookList b where b.BookName=:bookname ";
        Query query=manager.createQuery(hql);
        query.setParameter("bookname",name);
        List list=query.getResultList();
        manager.close();
        return list.size()>=1;
    }
}
