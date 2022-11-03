package Dao.Impl;

import Entity.Belongings;
import Entity.BookList;
import Util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class BelongingsDao extends BaseDao<Belongings> implements IsBookListDao{
    public boolean Login(String name){
        EntityManager manager= JPAUtil.getEntityManager();
        String hql ="select p from Belongings p where p.StuName=:stuname ";
        Query query=manager.createQuery(hql);
        query.setParameter("stuname",name);
        List list=query.getResultList();
        manager.close();
        return list.size()>=1;
    }
}
