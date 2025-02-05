package repository;

import model.Locacao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class LocacaoRepository {
    Session session;

    public LocacaoRepository(SessionFactory sessionFactory) {
    }

    public void save(Locacao locacao) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.persist(locacao);
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

    public Locacao getById(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Locacao locacao = null;
        try {
            transaction = session.beginTransaction();
            locacao = session.get(Locacao.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return locacao;
    }

    public List<Locacao> getAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        List<Locacao> locacoes = null;
        try {
            transaction = session.beginTransaction();
            locacoes = session.createQuery("from Locacao", Locacao.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return locacoes;
    }

    public void delete(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Locacao locacao = session.get(Locacao.class, id);
            if (locacao != null) {
                session.delete(locacao);
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
