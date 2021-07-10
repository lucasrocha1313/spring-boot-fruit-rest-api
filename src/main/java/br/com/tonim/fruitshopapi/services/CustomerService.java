package br.com.tonim.fruitshopapi.services;

import br.com.tonim.fruitshopapi.api.v1.model.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> findAll();
    CustomerDTO findByFirstname(String firstname);
}
