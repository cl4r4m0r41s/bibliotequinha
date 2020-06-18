package clarax;

import br.fjn.edu.pos.web.domain.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author leonardo
 */

 //Esta classe implementa com o CustomersRepository, mas a gente não entendeu o que é ainda

@ApplicationScoped
public class CustomerDB implements CustomersRepository {

    private List<Customer> dataB;

    public CustomersRepositoryAsMemoryDataBase() {
        this.dataB = new ArrayList<>();
        //Fazer conexão com o BD
    }

    @Override
    public void create(Customer customer) {
        this.dataB.add(customer);
    }

    @Override
    public Customer findById(String id) {
        return dataB.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Customer> list() {
        return this.dataB;
    }

    @Override
    public Customer update(Customer customer) {
        for (int i = 0; i < dataB.size(); i++) {
           if (dataB.get(i).getId().equals(customer.getId())){
            dataB.set(i, customer);
           } 
        }
        return customer;
    }

    @Override
    public void delete(String id) {
        customersDB.removeIf(customer -> customer.getId().equals(id));
    }
}
