package br.edu.fjn.library.dao;

import java.io.IOException;

import javax.persistence.EntityManager;

import br.edu.fjn.library.dao.util.ConnectionFactory;
import br.edu.fjn.library.model.Customer;
import br.edu.fjn.library.util.exceptions.LibraryException;

public class GenericDAO{

    public void save(Customer customer) {
        EntityManager manager = ConnectionFactory.getEntityManager();
        try {
            manager.getTransaction().begin();
            manager.persist(customer);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            if (manager.isOpen() && manager.getTransaction().isActive()) {
                manager.close();
            }
        }
    }

    public void update(Customer customer) {
        EntityManager manager = ConnectionFactory.getEntityManager();
        try {
            manager.getTransaction().begin();
            manager.merge(customer);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            if (manager.isOpen() && manager.getTransaction().isActive()) {
                manager.close();
            }
        }
    }

    public Customer findById(Integer id) throws LibraryException {

        if (id == null) {
            throw new LibraryException("Id de cliente inválido. Por favor, verificar!");
        }

        EntityManager em = ConnectionFactory.getEntityManager();
        try {
            Customer c = em.find(Customer.class, id);
            return c;
        } finally {
            if (em.isOpen() && em.getTransaction().isActive()) {
                em.close();
            }
        }
    }

    public void remove(Customer customer) {
        EntityManager manager = ConnectionFactory.getEntityManager();

        try {
            manager.getTransaction().begin();
            Customer c = manager.find(Customer.class, customer.getCode());
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