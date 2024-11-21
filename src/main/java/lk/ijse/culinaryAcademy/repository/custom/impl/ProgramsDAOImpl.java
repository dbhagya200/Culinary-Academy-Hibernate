package lk.ijse.culinaryAcademy.repository.custom.impl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.ijse.culinaryAcademy.config.SessionFactoryConfig;
import lk.ijse.culinaryAcademy.entity.Programs;
import lk.ijse.culinaryAcademy.repository.custom.ProgramsDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProgramsDAOImpl implements ProgramsDAO {

    private Session session;

    @Override
    public boolean save(Programs entity) throws SQLException, ClassNotFoundException {
        session.save(entity);
        return false;
    }

    @Override
    public void delete(Programs entity) throws SQLException, ClassNotFoundException {
        session.delete(entity);
    }

    @Override
    public void update(Programs entity) throws SQLException, ClassNotFoundException {
        session.update(entity);
    }

    @Override
    public ArrayList<Programs> getAll() throws SQLException, ClassNotFoundException {
        try{
            List<Programs> programs = session.createNativeQuery("SELECT * FROM programs", Programs.class).getResultList();
            return (ArrayList<Programs>) programs ;
        }catch (Exception e){
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public ArrayList<String> loadIds() throws SQLException {
        String sql = "SELECT P.id FROM Programs AS P";
        Query query = session.createQuery(sql);
        List list = query.list();
        session.close();
        return (ArrayList<String>) list;
    }

    @Override
    public void setSession(Session session) {
    this.session = session;
    }

    @Override
    public boolean updatePrograms(Programs entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public ObservableList<String> loadProgramsId() throws SQLException, ClassNotFoundException {
        ObservableList<String> programsData = FXCollections.observableArrayList();

        String hql = "SELECT p.programID FROM Programs p";
        Query<String> query = session.createQuery(hql, String.class);

        List<String> result = query.list();

        programsData.addAll(result);

        return programsData;
    }
}
