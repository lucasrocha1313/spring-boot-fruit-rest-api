package br.com.tonim.fruitshopapi.services;

import br.com.tonim.fruitshopapi.api.v1.mapper.CustomerMapper;
import br.com.tonim.fruitshopapi.domain.Customer;
import br.com.tonim.fruitshopapi.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {
    public static final Long ID = 2L;
    public static final String NAME = "Jimmy";

    @Mock
    CustomerRepository customerRepository;
    @Spy
    CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
    @InjectMocks
    CustomerServiceImpl customerService;

    @Test
    void findAllCustomersTest(){
        var customers = Arrays
                .asList(Customer.builder().id(ID).firstname(NAME).lastname(NAME+" lastname").build(),
                        Customer.builder().id(2L).firstname("test1").lastname("test1"+" lastname").build(),
                        Customer.builder().id(3L).firstname("test2").lastname("test2"+" lastname").build());

        when(customerRepository.findAll()).thenReturn(customers);

        var customersReturned = customerService.findAll();

        assertEquals(3, customersReturned.size());
    }

    @Test
    void findCustomerByFirstnameTest() {
        var customer = Customer.builder().id(ID).firstname(NAME).lastname(NAME+" lastname").build();
//        customer.setId(ID);
//        customer.setFirstname(NAME);
//        customer.setLastname(NAME + "ln");
        when(customerRepository.findByFirstname(NAME)).thenReturn(customer);

        var customerReturned = customerService.findByFirstname(NAME);

        assertEquals(NAME, customerReturned.getFirstname());
        assertEquals(ID, customerReturned.getId());
    }
}