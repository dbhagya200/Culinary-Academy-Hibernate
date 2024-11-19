package lk.ijse.culinaryAcademy.repository;

import lk.ijse.culinaryAcademy.repository.Impl.ProgramsRepositoryImpl;

public class RepositoryFactory {
    private static RepositoryFactory repositoryFactory;
    private RepositoryFactory() {}

    public static RepositoryFactory getInstance() {
        return repositoryFactory == null
                ? repositoryFactory = new RepositoryFactory()
                : repositoryFactory;
    }

    public enum RepositoryTypes {
        PROGRAMS
    }

    public SuperRepository getRepository(RepositoryTypes types) {
        switch (types) {
            case PROGRAMS:
                return new ProgramsRepositoryImpl();
            default:
                return null;
        }
    }
}
