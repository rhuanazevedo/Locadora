package repository;

import model.Veiculo;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class VeiculoRepository {
    private Session session;

    public VeiculoRepository() {
    }

    // Metodo para salvar um Veiculo
    public void save(Veiculo veiculo) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.persist(veiculo);
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

    public List<Veiculo> getByTipoDisponivel(String tipo) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        List<Veiculo> veiculos = null;

        try {
            transaction = session.beginTransaction();
            if (tipo.equalsIgnoreCase("Carro")) {
                veiculos = session.createQuery(
                                "FROM Veiculo v WHERE v.class = Carro AND v.disponivel = true", Veiculo.class)
                        .getResultList();
            } else {
                veiculos = session.createQuery(
                                "FROM Veiculo v WHERE v.class = Moto AND v.disponivel = true", Veiculo.class)
                        .getResultList();
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

        return veiculos;
    }


    public Veiculo getById(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Veiculo veiculo = null;
        try {
            transaction = session.beginTransaction();
            veiculo = session.get(Veiculo.class, id);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return veiculo;
    }

    // Método para obter todos os Veiculos
    public List<Veiculo> getAll() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        List<Veiculo> veiculos = null;
        try {
            transaction = session.beginTransaction();
            veiculos = session.createQuery("from Veiculo", Veiculo.class).list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return veiculos;
    }

    // Método para excluir um Veiculo
    public void delete(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Veiculo veiculo = session.get(Veiculo.class, id);
            if (veiculo != null) {
                session.delete(veiculo);
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

    public void alterarDisponibilidade(int id, boolean disponivel) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Veiculo veiculo = session.get(Veiculo.class, id);
            if (veiculo != null) {
                veiculo.setDisponivel(disponivel);
                session.merge(veiculo); // Atualiza o estado do objeto no banco
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
