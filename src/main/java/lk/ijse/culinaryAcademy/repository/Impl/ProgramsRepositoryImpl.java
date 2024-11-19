package lk.ijse.culinaryAcademy.repository.Impl;

import lk.ijse.culinaryAcademy.entity.Programs;
import lk.ijse.culinaryAcademy.repository.ProgramsRepository;
import lombok.Setter;
import org.hibernate.Session;


public class ProgramsRepositoryImpl implements ProgramsRepository {

    @Setter
    private static Session session;


    @Override
    public void add(Programs entity) {
        session.save(entity);
    }

    @Override
    public int getAllBookCount() {
        return 0;
    }
}
