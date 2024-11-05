package lk.ijse.culinaryAcademy.repository;

import org.hibernate.Session;

public interface SuperRepository {
    void setSession(Session session);
}
