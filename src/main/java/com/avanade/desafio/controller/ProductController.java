package com.avanade.desafio.controller;

import com.avanade.desafio.entity.ProductModel;
import com.avanade.desafio.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<List<ProductModel>> getAllProducts() {
        return new
                ResponseEntity<List<ProductModel>>(productRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<ProductModel>
    getOneProduct(@PathVariable(value="id") Long id){
        Optional<ProductModel> productO =
                productRepository.findById(id);
        if(productO.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ProductModel>(productO.get(),
                HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<ProductModel>saveProduct(@RequestBody @Validated ProductModel product) {
        return new ResponseEntity<ProductModel>(productRepository.save(product), HttpStatus.CREATED);
    }

}
