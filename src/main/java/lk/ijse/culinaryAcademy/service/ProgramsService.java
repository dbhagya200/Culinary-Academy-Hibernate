package lk.ijse.culinaryAcademy.service;

import lk.ijse.culinaryAcademy.dto.Programsdto;
import lk.ijse.culinaryAcademy.service.SuperService;

public interface ProgramsService extends SuperService{
boolean addPrograms(Programsdto dto);
}
