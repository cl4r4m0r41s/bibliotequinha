package br.edu.fjn.library.customer;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Mateus
 */

@ApplicationScoped
public class CustomerDB implements Cr {

    private List<CustomerDB> dataB;

    public CustomerDB() {
        this.dataB = new ArrayList<>();
        //Fazer conexão com o BD
    }

    @Override
    public void create(CustomerDB customerDB) {
        this.dataB.add(customerDB);
    }

    @Override
    public CustomerDB findById(String id) {
        return dataB.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<CustomerDB> list() {
        return this.dataB;
    }

    @Override
    public CustomerDB update(CustomerDB customerDB) {
        for (int i = 0; i < dataB.size(); i++) {
           if (dataB.get(i).getId().equals(customerDB.getId())){
            dataB.set(i, customerDB);
           } 
        }
        return customerDB;
    }

    @Override
    public void delete(String id) {
        customersDB.removeIf(customer -> customer.getId().equals(id));
    }
}
