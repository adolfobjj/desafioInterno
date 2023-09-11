package com.avanade.desafio.controller;

import java.util.List;


import com.avanade.desafio.models.ProdutoModel;
import com.avanade.desafio.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @ApiOperation(value="Retorna uma lista de Produtos")
    @GetMapping("/produtos")
    public List<ProdutoModel> listaProdutos(){
        return produtoRepository.findAll();
    }

    @ApiOperation(value="Retorna um produto unico")
    @GetMapping("/produto/{id}")
    public ProdutoModel listaProdutoUnico(@PathVariable(value="id") long id){
        return produtoRepository.findById(id);
    }

    @ApiOperation(value="Salva um produto")
    @PostMapping("/produto")
    public ProdutoModel salvaProduto(@RequestBody @Validated ProdutoModel produto) {
        return produtoRepository.save(produto);
    }
}
