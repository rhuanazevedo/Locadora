package repository;

import model.Cliente;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class ClienteRepository {
    Session session;

    public ClienteRepository() {
    }

    public void save(Cliente cliente) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.persist(cliente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Cliente getById(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Cliente cliente = null;
        try {
            transaction = session.beginTransaction();
            cliente = session.get(Cliente.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cliente;
    }

    public List<Cliente> getAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        List<Cliente> clientes = null;
        try {
            transaction = session.beginTransaction();
            clientes = session.createQuery("from Cliente", Cliente.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return clientes;
    }

    public void delete(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Cliente cliente = session.get(Cliente.class, id);
            if (cliente != null) {
                session.delete(cliente);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

