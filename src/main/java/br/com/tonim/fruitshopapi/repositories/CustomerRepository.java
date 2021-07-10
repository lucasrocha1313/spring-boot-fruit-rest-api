package br.com.tonim.fruitshopapi.repositories;

import br.com.tonim.fruitshopapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByFirstname(String firstName);
}
