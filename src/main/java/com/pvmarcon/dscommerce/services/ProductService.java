package com.pvmarcon.dscommerce.services;

import com.pvmarcon.dscommerce.dto.ProductDTO;
import com.pvmarcon.dscommerce.entities.Product;
import com.pvmarcon.dscommerce.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id){
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return new ProductDTO(product);
    }
}
