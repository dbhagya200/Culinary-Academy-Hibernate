package lk.ijse.culinaryAcademy.util;

import lk.ijse.culinaryAcademy.controller.AddProgramsController;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class ProgramsIDGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
        String prefix = "P";
        String query = "SELECT COUNT(c) FROM Programs c";  // Adjust this query to your table/entity name
        Long count = (Long) session.createQuery(query).uniqueResult();
        AddProgramsController.id = prefix + String.format("%03d", (count + 1));
        return prefix + String.format("%03d", (count + 1));
    }
}
