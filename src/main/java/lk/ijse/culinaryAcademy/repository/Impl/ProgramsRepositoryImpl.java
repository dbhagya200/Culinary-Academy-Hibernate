package lk.ijse.culinaryAcademy.repository.Impl;

import lk.ijse.culinaryAcademy.entity.Programs;
import lk.ijse.culinaryAcademy.repository.ProgramsRepository;
import org.hibernate.Session;

public class ProgramsRepositoryImpl implements ProgramsRepository {

    private Session session;
    @Override
    public void setSession(Session session) {
        this.session = session;
    }


    private static ProgramsRepositoryImpl programsRepositoryImpl;

    private ProgramsRepositoryImpl(){}

    public static ProgramsRepositoryImpl getInstance(){
        return null == programsRepositoryImpl
                ? programsRepositoryImpl = new ProgramsRepositoryImpl()
                : programsRepositoryImpl;
    }

    @Override
    public Long add(Programs programs) {
        return (Long) session.save(programs);
    }
}
