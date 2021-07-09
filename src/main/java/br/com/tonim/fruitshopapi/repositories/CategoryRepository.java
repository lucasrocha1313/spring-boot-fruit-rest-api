package br.com.tonim.fruitshopapi.repositories;

import br.com.tonim.fruitshopapi.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
