package com.dbakes.posamin.parameters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbakes.posamin.parameters.models.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {
   
    Category findByCategoryName(String categoryName);

}
