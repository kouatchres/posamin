package com.dbakes.posamin.parameters.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

   @GetMapping("/categoryList")
   public String catList(){
    return "/categoryList";
   }
}
