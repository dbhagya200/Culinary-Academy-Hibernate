package lk.ijse.culinaryAcademy.repository;

import lk.ijse.culinaryAcademy.repository.SuperDAO;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface CrudDAO<T,ID> extends SuperDAO {
    boolean save(T entity) throws SQLException, ClassNotFoundException;
    void delete(T entity) throws SQLException, ClassNotFoundException;
    void update(T entity) throws SQLException, ClassNotFoundException;
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    ArrayList<ID> loadIds() throws SQLException ;

    void setSession(Session session);
}
