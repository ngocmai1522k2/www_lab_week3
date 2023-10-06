package vn.edu.iuh.fit.backend.configs.services;

import vn.edu.iuh.fit.backend.configs.models.Product;
import vn.edu.iuh.fit.backend.configs.respositories.ProductRepository;

import java.util.List;

public class ProductServices {
    private final ProductRepository repository;

    public ProductServices() {
        repository = new ProductRepository();
    }

    public void insertProduct(Product product){
        repository.insert(product);
    }

    public List<Product> getActiveProducts(){
        return repository.getActiveProduct();
    }
}
