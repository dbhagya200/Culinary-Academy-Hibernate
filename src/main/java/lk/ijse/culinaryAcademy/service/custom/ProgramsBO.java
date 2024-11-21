package lk.ijse.culinaryAcademy.service.custom;

import lk.ijse.culinaryAcademy.dto.ProgramsDTO;
import lk.ijse.culinaryAcademy.service.SuperBO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProgramsBO extends SuperBO {
    boolean savePrograms(ProgramsDTO dto);
    boolean updatePrograms(ProgramsDTO dto);
    boolean deletePrograms(ProgramsDTO dto);
    ArrayList<ProgramsDTO> getAllPrograms() throws SQLException;
}
