package com.avanade.desafio.repository;

import com.avanade.desafio.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{

    ProdutoModel findById(long id);

}
