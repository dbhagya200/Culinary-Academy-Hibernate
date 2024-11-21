package lk.ijse.culinaryAcademy.config;

import lk.ijse.culinaryAcademy.entity.Programs;
import lk.ijse.culinaryAcademy.util.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SessionFactoryConfig {
    private static SessionFactoryConfig sessionFactoryConfig;

    private final SessionFactory sessionFactory;

    Properties properties = new Properties();

    public SessionFactoryConfig() {
        try{
            InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties");
            if(inputStream == null){
                System.out.println("Resource not found!");
            } else {
                properties.load(inputStream);
                System.out.println("Resource loaded seccessfully!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        sessionFactory = new Configuration()
                .setProperties(properties)
                .addAnnotatedClass(Programs.class)
                .buildSessionFactory();
    }

    public static SessionFactoryConfig getInstance() {
        return (sessionFactoryConfig == null) ? sessionFactoryConfig = new SessionFactoryConfig() : sessionFactoryConfig;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
