package br.com.tonim.fruitshopapi.services;

import br.com.tonim.fruitshopapi.api.v1.mapper.CustomerMapper;
import br.com.tonim.fruitshopapi.api.v1.model.CustomerDTO;
import br.com.tonim.fruitshopapi.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDTO> findAll() {
        return customerRepository.findAll()
                .stream().map(customerMapper::customerToCustomerDTO).collect(Collectors.toList());
    }

    @Override
    public CustomerDTO findByFirstname(String firstname) {
        return customerMapper.customerToCustomerDTO(customerRepository.findByFirstname(firstname));
    }
}
