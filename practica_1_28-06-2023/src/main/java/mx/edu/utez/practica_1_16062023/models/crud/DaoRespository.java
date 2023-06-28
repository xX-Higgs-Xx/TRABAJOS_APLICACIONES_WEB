package mx.edu.utez.practica_1_16062023.models.crud;

import java.util.List;

public interface DaoRespository<T> {
    List<T>findAll();
    T findOne(long id);
    boolean save(T object);
    boolean update(T object);
    boolean delete(Long id);
}
