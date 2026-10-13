package uk.ac.westminster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired
    private ProductService productService;

 //   @GetMapping("/{id}")
//    public Product getbyId(@PathVariable("id") Long id ) {
//        return new Product(id,"Laptop",999.9);
    @GetMapping("/products")
    public List<Product> getProducts(@PathVariable String id) {
        return productService.getAllProducts();
    }

    @GetMapping(/"products/{id}")
     public Product getProductById(@PathVariable Long id){
        productService.deleteProduct(id).orElse(null);
     }





    }



