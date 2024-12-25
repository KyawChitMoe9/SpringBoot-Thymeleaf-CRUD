package com.springbootproject_crud_tl.controller;

import com.springbootproject_crud_tl.entity.Product;
import com.springbootproject_crud_tl.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping({"", "/"})
    public String showProductList(Model model) {
        List<Product> products = productRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
        model.addAttribute("products", products);
        return "products/index";  // This is the Thymeleaf template name
    }
}


