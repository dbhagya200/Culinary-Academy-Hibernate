package lk.ijse.culinaryAcademy.repository;

import lk.ijse.culinaryAcademy.repository.custom.impl.ProgramsDAOImpl;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {
    }
    public static DAOFactory getDaoFactory() {
        return daoFactory == null ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes {
        PROGRAMSDAO,
    }

    public <T extends SuperDAO> T getDAO(DAOTypes type) {
        switch (type) {
            case PROGRAMSDAO:
                return (T)new ProgramsDAOImpl();

        }
        return null;
    }
}
