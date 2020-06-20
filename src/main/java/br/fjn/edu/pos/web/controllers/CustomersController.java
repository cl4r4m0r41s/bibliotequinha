package br.fjn.edu.pos.web.controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.IncludeParameters;
import javax.inject.Inject;

@Auth
@Controller
@Path("/customers")
public class CustomersController {

    
    @Inject
    private Result result;
    
    @Inject
    private CustomersService customersService;
    
   
    @Get("new")
    public void create(){
        
    }
    
    @Post("")
    @IncludeParameters
    public void store(Customer customer) {          
        try {
            customersService.create(customer);
            result.redirectTo(this).getCustomers();
        } catch (Exception ex) {
            result.include("cpfError", ex.getMessage());
            result.redirectTo(this).create();
        }    
    }

    @Post("update")
    public void update(Customer customer) {
        customersService.update(customer);
        result.redirectTo(this).getCustomers();
    }

    @Get("id/{id}")
    public void getCustomersById(String id){
        Customer customer = customersService.findById(id);    
        result.include("customerToUpdate", customer);
        result.of(this).update(null);
    }    
    
    @Get("")
    public void getCustomers() {
       result.include("customerList", customersService.list());
    }
    
    @Post("remove")
    public void remove(String id){
        customersService.delete(id);
        result.redirectTo(this).getCustomers();          
    }
}