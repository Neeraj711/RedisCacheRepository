package com.example.RedisCacheRepository.repository;

import com.example.RedisCacheRepository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long> {
}
