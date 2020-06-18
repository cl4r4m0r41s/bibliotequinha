package br.edu.fjn.library.dao;

import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.postgresql.core.ConnectionFactory;

import br.edu.fjn.library.dao.*;
import br.edu.fjn.library.customer.CustomerDB;

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

    public CustomerDB findById(Integer id) throws LibraryException {

        if (id == null) {
            throw new LibraryException("Id de cliente inválido. Por favor, verificar!");
        }

        EntityManager em = ConnectionFactory.getEntityManager();
        try {
            CustomerDB c = em.find(CustomerDB.class, id);
            return c;
        } finally {
            if (em.isOpen() && em.getTransaction().isActive()) {
                em.close();
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