package br.com.tonim.fruitshopapi.api.v1.mapper;

import br.com.tonim.fruitshopapi.api.v1.model.CustomerDTO;
import br.com.tonim.fruitshopapi.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
