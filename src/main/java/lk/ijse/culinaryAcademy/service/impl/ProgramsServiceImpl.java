package lk.ijse.culinaryAcademy.service.impl;

import lk.ijse.culinaryAcademy.dto.Programsdto;
import lk.ijse.culinaryAcademy.entity.Programs;
import lk.ijse.culinaryAcademy.repository.Impl.ProgramsRepositoryImpl;
import lk.ijse.culinaryAcademy.repository.ProgramsRepository;
import lk.ijse.culinaryAcademy.repository.RepositoryFactory;
import lk.ijse.culinaryAcademy.service.ProgramsService;
import lk.ijse.culinaryAcademy.util.SessionFactoryConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProgramsServiceImpl implements ProgramsService {

    ProgramsRepository programsRepository = (ProgramsRepository) RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryTypes.PROGRAMS);
    private Session session;

    public void initializeSession() {
        session = SessionFactoryConfig.getInstance()
                .getSession();
    }


    @Override
    public boolean addPrograms(Programsdto programsdto) {
        Programs programs = convertToEntity(programsdto);
        initializeSession();
        Transaction transaction = session.beginTransaction();
        try {
            ProgramsRepositoryImpl.setSession(session);
            programsRepository.add(programs);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    private Programs convertToEntity(Programsdto dto) {
        Programs programs = new Programs();
        programs.setProgramID(dto.getProgramID());
        programs.setProgramName(dto.getProgramName());
        programs.setProgramDuration(dto.getProgramDuration());
        programs.setProgramFee(dto.getProgramFee());
        return programs;
    }

    private Programsdto convertToDto(Programs programs) {
       return new Programsdto(
               programs.getProgramID(),
               programs.getProgramName(),
               programs.getProgramDuration(),
               programs.getProgramFee());
    }
}

