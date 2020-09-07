package service;

import java.util.List;

import service.Product;

public interface ProductService {
	Product createProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(long productId);
    void deleteProduct(long id);
}
