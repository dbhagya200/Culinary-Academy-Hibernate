package lk.ijse.culinaryAcademy.repository;

import javax.persistence.Id;

public interface CrudRepository<T, ID> extends SuperRepository {
    ID add(T object);
}
