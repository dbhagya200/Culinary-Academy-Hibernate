package lk.ijse.culinaryAcademy.service;

import lk.ijse.culinaryAcademy.service.impl.ProgramsServiceImpl;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {}

    public static ServiceFactory getInstance(){
        return serviceFactory == null
                ? serviceFactory = new ServiceFactory()
                : serviceFactory;
    }

    public enum ServiceTypes{
        PROGRAMS
    }

    public SuperService getService(ServiceTypes types){
        switch (types){
            case PROGRAMS:
                return new ProgramsServiceImpl();
            default:
                return null;
        }
    }
}
