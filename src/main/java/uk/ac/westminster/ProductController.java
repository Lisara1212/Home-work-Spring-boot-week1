package uk.ac.westminster;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product")
public class ProductController {

    @GetMapping("/{id}")
    public Product getbyId(@PathVariable("id") Long id ) {
        return new Product(id,"Laptop",999.9);


    }
}
