package com.fatect.projeto.service;

import com.fatect.projeto.Produto;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface IProdutoService {

    @Bean
    public List<Produto> consultaCatalogo();

    List<Produto> consultaCatalago();
}