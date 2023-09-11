package com.avanade.desafio.repository;

import com.avanade.desafio.entity.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends
        JpaRepository<ProductModel, Long>{
}
