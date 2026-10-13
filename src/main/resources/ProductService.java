package uk.ac.westminster;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextID = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

  public Product addProduct(Product product) {
        product.setId(nextID++);
        products.add(product);
        return product;
  }

  public Optional<Product> getProduct(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
  }
  public List<Product> findByName(String category) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
  }





}
