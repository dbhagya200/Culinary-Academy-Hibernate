package lk.ijse.culinaryAcademy.repository.custom;

import javafx.collections.ObservableList;
import lk.ijse.culinaryAcademy.repository.CrudDAO;
import lk.ijse.culinaryAcademy.entity.Programs;

import java.sql.SQLException;

public interface ProgramsDAO extends CrudDAO<Programs, String> {
    boolean updatePrograms(Programs entity) throws SQLException, ClassNotFoundException;
    ObservableList<String> loadProgramsId() throws SQLException, ClassNotFoundException;
}
