package lk.ijse.culinaryAcademy.repository;

import javax.persistence.Id;

public interface CrudRepository<T> extends SuperRepository {
    void add(T entity);
}
