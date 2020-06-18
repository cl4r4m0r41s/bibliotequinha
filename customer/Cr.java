 */
package clarax;

import br.fjn.edu.pos.web.domain.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author leonardo
 */
@ApplicationScoped
public class Cr {

    private List<Customer> dataB;

    public Cr() {
       this.dataB = new ArrayList<>();
    }

    public void create(Customer customer){
        this.dataB.add(customer);
    }

    public Customer findById(String id){
        return null;
    }

    public List<Customer> list(){
        return this.dataB;
    }

    public Customer update(Customer customer){
        return null;
    }

    public void delete(String id){

    }
}