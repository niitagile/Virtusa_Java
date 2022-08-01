package com.jpa;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
        
    @Autowired
    ProductRepository productRepository;//reference object of interface
    
    public List<ProductEntity> getAllProduct(){
        return productRepository.findAll();
    }
        
    public ProductEntity getProduct(int id){
        return productRepository.findById(id).get();
    }
        
    public void addProduct(ProductEntity pe){
        productRepository.save(pe);
    }
        
    public void updateProduct(int id, ProductEntity pe){
        if(productRepository.findById(id).isPresent()) {
            ProductEntity oldProductEntity=productRepository.findById(id).get();
            oldProductEntity.setName(pe.getName());
            oldProductEntity.setDescription(pe.getDescription());
            productRepository.save(oldProductEntity);
        }
    }
        
    public void deleteProduct(int id){
        productRepository.deleteById(id);       
    }
}
