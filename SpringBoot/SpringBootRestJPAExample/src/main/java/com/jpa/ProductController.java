package com.jpa;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapi") 
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @RequestMapping("/allproduct")
    public List<ProductEntity> getAllProduct(){
        return productService.getAllProduct();
    }
    
    @RequestMapping("/product/{id}")
    public ProductEntity getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/product")   
    public void addProduct(@RequestBody ProductEntity pe ) {
        productService.addProduct(pe);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/product/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody ProductEntity pe ) {
        productService.updateProduct(id, pe);
    }   

    @RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
    public void deleteProduct(@PathVariable int id)  {
        productService.deleteProduct(id);
    }
}
