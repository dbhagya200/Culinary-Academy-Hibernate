package lk.ijse.culinaryAcademy.service.impl;

import lk.ijse.culinaryAcademy.dto.Programsdto;
import lk.ijse.culinaryAcademy.repository.Impl.ProgramsRepositoryImpl;
import lk.ijse.culinaryAcademy.repository.ProgramsRepository;
import lk.ijse.culinaryAcademy.service.ProgramsService;
import lk.ijse.culinaryAcademy.util.SessionFactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProgramsServiceImpl implements ProgramsService {
    private static ProgramsService ProgramsService;
    private Session session;

    private final ProgramsRepository programsRepository;

    private ProgramsServiceImpl(){
        programsRepository = ProgramsRepositoryImpl.getInstance();
    }
    public static ProgramsService getInstance(){
        return null == ProgramsService
                ? ProgramsService = new ProgramsServiceImpl()
                : ProgramsService;
    }

    @Override
    public long addPrograms(Programsdto programsdto) {
        session = SessionFactoryConfig.getInstance()
                .getSession();
        Transaction transaction = session.beginTransaction();
        try {
            programsRepository.setSession(session);
            Long id = Long.valueOf(programsRepository.add(programsdto.toEntity())); // We pass it to the repository by converting it to an entity
            transaction.commit();
            session.close();
            return id;
        } catch (Exception ex) {
            transaction.rollback();
            session.close();
            ex.printStackTrace();
            return -1L;
        }
    }
}
