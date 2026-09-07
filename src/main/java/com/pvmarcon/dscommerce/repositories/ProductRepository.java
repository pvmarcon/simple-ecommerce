package com.pvmarcon.dscommerce.repositories;

import com.pvmarcon.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
