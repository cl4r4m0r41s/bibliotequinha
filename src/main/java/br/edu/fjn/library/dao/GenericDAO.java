package br.edu.fjn.library.dao;

import org.postgresql.core.ConnectionFactory;
import br.edu.fjn.library.components.CustomerDB;
import javax.persistence.EntityManager;

public class GenericDAO {

    public void save(CustomerDB customerDB) {
        EntityManager manager = ConnectionFactory.getEntityManager();
        try {
            manager.getTransaction().begin();
            manager.persist(customerDB);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            if (manager.isOpen() && manager.getTransaction().isActive()) {
                manager.close();
            }
        }
    }

    public void update(CustomerDB customerDB) {
        EntityManager manager = ConnectionFactory.getEntityManager();
        try {
            manager.getTransaction().begin();
            manager.merge(customerDB);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            if (manager.isOpen() && manager.getTransaction().isActive()) {
                manager.close();
            }
        }
    }

    public void remove(CustomerDB customerDB) {
        EntityManager manager = ConnectionFactory.getEntityManager();

        try {
            manager.getTransaction().begin();
            CustomerDB c = manager.find(CustomerDB.class, customerDB.getCode());
            manager.remove(c);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            if (manager.isOpen() && manager.getTransaction().isActive()) {
                manager.close();
            }
        }
    }

}