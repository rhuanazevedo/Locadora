import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import javax.security.auth.login.Configuration;

public class Main {
    public static void main(String[] args) {
        try {
            HibernateUtil.getSessionFactory().openSession();

        } catch (Exception e) {

        }
    }
}