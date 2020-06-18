package br.edu.fjn.library.customer;

import br.edu.fjn.library.customer.Cr;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Mateus
 */
@ApplicationScoped
public class Cr {

    private List<CustomerDB> dataB;

    public Cr() {
       this.dataB = new ArrayList<>();
    }

    public void create(CustomerDB customerDB){
        this.dataB.add(customerDB);
    }

    public CustomerDB findById(String id){
        return null;
    }

    public List<CustomerDB> list(){
        return this.dataB;
    }

    public CustomerDB update(CustomerDB customerDB){
        return null;
    }

    public void delete(String id){

    }
}