package com.springbootproject_crud_tl.service;

import com.springbootproject_crud_tl.entity.Product;
import com.springbootproject_crud_tl.repo.ProductRepo;
import com.springbootproject_crud_tl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl  {
//
//    @Autowired
//    private ProductRepo productRepo;
//
//    @Override
//    public List<Product> getAllProducts() {
//        return productRepo.findAll();
//    }

//    @Override
//    public Product getProductById(Integer id) {
//        return productRepo.findById(id)
//                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
//    }
//
//    @Override
//    public Product saveProduct(Product product, MultipartFile file) throws IOException {
//        if (!file.isEmpty()) {
//            String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
//            Path path = Paths.get("images/" + fileName);
//            Files.write(path, file.getBytes());
//            product.setImageFileName(fileName);
//        }
//        product.setCreateAt(new Date());
//        return productRepo.save(product);
//    }
//
//    @Override
//    public void deleteProduct(Integer id) {
//        Product product = getProductById(id);
//        if (product.getImageFileName() != null) {
//            Path imagePath = Paths.get("images/" + product.getImageFileName());
//            try {
//                Files.deleteIfExists(imagePath);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        productRepo.deleteById(id);
//    }
//
//    @Override
//    public Product updateProduct(Integer id, Product updatedProduct, MultipartFile file) throws IOException {
//        Product existingProduct = getProductById(id);
//
//        // Update fields
//        existingProduct.setName(updatedProduct.getName());
//        existingProduct.setBranch(updatedProduct.getBranch());
//        existingProduct.setCategory(updatedProduct.getCategory());
//        existingProduct.setPrice(updatedProduct.getPrice());
//        existingProduct.setDescription(updatedProduct.getDescription());
//
//        // Handle new image upload
//        if (!file.isEmpty()) {
//            // Delete old image if exists
//            if (existingProduct.getImageFileName() != null) {
//                Path oldImagePath = Paths.get("images/" + existingProduct.getImageFileName());
//                Files.deleteIfExists(oldImagePath);
//            }
//
//            // Save new image
//            String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
//            Path path = Paths.get("images/" + fileName);
//            Files.write(path, file.getBytes());
//            existingProduct.setImageFileName(fileName);
//        }
//
//        return productRepo.save(existingProduct);
//    }
}