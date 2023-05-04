package com.dbakes.posamin.parameters.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dbakes.posamin.parameters.models.Category;
import com.dbakes.posamin.parameters.services.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
public CategoryService categoryService;

    @GetMapping("/categoryAdd")
    public String addNewCat(){
        return "/parameters/categoryAdd";
    }



   @GetMapping("/categories")
   public String getAllCategories(Model model){
        List<Category> categories = categoryService.listOfCategories();
model.addAttribute("categories", categories);
   return "/parameters/categoryList";
   }
}
