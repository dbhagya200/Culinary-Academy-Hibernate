package lk.ijse.culinaryAcademy.service.custom.impl;

import lk.ijse.culinaryAcademy.config.SessionFactoryConfig;
import lk.ijse.culinaryAcademy.dto.ProgramsDTO;
import lk.ijse.culinaryAcademy.entity.Programs;
import lk.ijse.culinaryAcademy.repository.DAOFactory;
import lk.ijse.culinaryAcademy.repository.custom.ProgramsDAO;
import lk.ijse.culinaryAcademy.service.custom.ProgramsBO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProgramsBOImpl implements ProgramsBO {

    ProgramsDAO programsDAO = DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.PROGRAMSDAO);
    @Override
    public boolean savePrograms(ProgramsDTO dto) {
        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        try{
            programsDAO.setSession(session);
            programsDAO.save(dto.toEntity());
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updatePrograms(ProgramsDTO dto) {
        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {
            programsDAO.setSession(session);
            programsDAO.update(dto.toEntity());
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deletePrograms(ProgramsDTO dto) {
        Session session = SessionFactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            programsDAO.setSession(session);
            programsDAO.delete(dto.toEntity());
            transaction.commit();
            session.close();
            return true;
        }catch (Exception e){
            transaction.rollback();
            session.close();
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public ArrayList<ProgramsDTO> getAllPrograms() throws SQLException {
        Session session = SessionFactoryConfig.getInstance().getSession();
        programsDAO.setSession(session);
        ArrayList<Programs> programs = null;

        try {
            programs = programsDAO.getAll();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<ProgramsDTO> ProgramsDTOS = new ArrayList<>();
        for(Programs p : programs){
            ProgramsDTOS.add(new ProgramsDTO(
                    p.getProgramID(),
                    p.getProgramName(),
                    p.getProgramDuration(),
                    p.getProgramFee()
            ));
        }
        session.close();
        return ProgramsDTOS;
    }
}
