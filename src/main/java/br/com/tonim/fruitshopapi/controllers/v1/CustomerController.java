package br.com.tonim.fruitshopapi.controllers.v1;

import br.com.tonim.fruitshopapi.api.v1.model.CustomerListDTO;
import br.com.tonim.fruitshopapi.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer/")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<Object> findAll(){
        return new ResponseEntity<>(new CustomerListDTO(customerService.findAll()), HttpStatus.OK);
    }

    @GetMapping("{firstname}")
    public ResponseEntity<Object> findByName(@PathVariable String firstname){
        return new ResponseEntity<>(customerService.findByFirstname(firstname), HttpStatus.OK);
    }
}
