package com.dbakes.posamin.parameters.services;

import com.dbakes.posamin.parameters.models.Category;
import com.dbakes.posamin.parameters.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

@Autowired
private CategoryRepository categoryRepository;

public List<Category> listOfCategories(){
    return categoryRepository.findAll();
}


}
