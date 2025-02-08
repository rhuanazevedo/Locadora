package util;

import lombok.Getter;
import model.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    @Getter
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Configuração do Hibernate
            Configuration configuration = new Configuration();

            // Adicionando classes anotadas
            configuration.addAnnotatedClass(Veiculo.class);
            configuration.addAnnotatedClass(Carro.class);
            configuration.addAnnotatedClass(Moto.class);
            configuration.addAnnotatedClass(Cliente.class);
            configuration.addAnnotatedClass(Locacao.class);

            // Configurações manuais
            configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/locadora");
            configuration.setProperty("hibernate.default_schema", "locadora");
            configuration.setProperty("hibernate.connection.username", "postgres");
            configuration.setProperty("hibernate.connection.password", "admin");
            configuration.setProperty("hibernate.hbm2ddl.auto", "update");
            configuration.setProperty("hibernate.show_sql", "true");

            // Criando o ServiceRegistry corretamente
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();

            // Construindo o SessionFactory
            return configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            System.err.println("Erro ao inicializar Hibernate: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }
}
