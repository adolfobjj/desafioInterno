package com.avanade.desafio.repository;

import com.avanade.desafio.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{


}
