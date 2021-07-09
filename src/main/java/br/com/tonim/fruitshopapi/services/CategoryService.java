package br.com.tonim.fruitshopapi.services;

import br.com.tonim.fruitshopapi.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategoryByName(String name);
}
