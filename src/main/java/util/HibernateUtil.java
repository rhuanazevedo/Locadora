package util;

import lombok.Getter;
import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    @Getter
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure()
                    .addAnnotatedClass(Veiculo.class)
                    .addAnnotatedClass(Carro.class)
                    .addAnnotatedClass(Moto.class)
                    .addAnnotatedClass(Cliente.class)
                    .addAnnotatedClass(Locacao.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Falha ao criar SessionFactory: " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

}

