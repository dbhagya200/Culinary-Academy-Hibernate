package lk.ijse.culinaryAcademy.repository;

import lk.ijse.culinaryAcademy.entity.Programs;
import lk.ijse.culinaryAcademy.repository.CrudRepository;

public interface ProgramsRepository extends CrudRepository<Programs> {
    int getAllBookCount();
}
