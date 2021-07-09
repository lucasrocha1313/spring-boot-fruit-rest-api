package br.com.tonim.fruitshopapi.api.v1.mapper;

import br.com.tonim.fruitshopapi.domain.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CategoryMapperTest {
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
     public void categoryToCategoryDTOTest(){
         var category = new Category();
        var testName = "testName";
        category.setName(testName);
        var id = 1L;
        category.setId(id);

         var categoryDTO = categoryMapper.categoryToCategoryDTO(category);

         assertEquals(id, categoryDTO.getId());
         assertEquals(testName, categoryDTO.getName());
    }
}