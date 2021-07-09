package br.com.tonim.fruitshopapi.api.v1.mapper;

import br.com.tonim.fruitshopapi.api.v1.model.CategoryDTO;
import br.com.tonim.fruitshopapi.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
