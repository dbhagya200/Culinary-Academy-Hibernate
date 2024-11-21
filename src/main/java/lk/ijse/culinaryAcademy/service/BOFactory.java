package lk.ijse.culinaryAcademy.service;

import lk.ijse.culinaryAcademy.service.custom.impl.ProgramsBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {}

    public static BOFactory getBoFactory() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOType {
        PROGRAMSBO
    }

    public <T extends SuperBO> T getBO(BOFactory.BOType boType) {
        switch (boType) {
            case PROGRAMSBO:
                return (T)new ProgramsBOImpl();
        }
        return null;
    }
}
