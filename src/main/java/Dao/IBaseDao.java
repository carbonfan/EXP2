package Dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T>{
    void save(T object);
    void update(T object);
    void delete(Serializable i);
    T getOne(Serializable i);
    List<T> getAll();
}
