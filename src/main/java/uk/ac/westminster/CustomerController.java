package uk.ac.westminster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Costumer")
public class CustomerController {
    @GetMapping("/{id}")
    public String getCostumer(@PathVariable String id) {

        Address address = new Address("115 New Cavendish Street", "London", "W1W 6UW");

        return String.format("Costumer for %s", id);



    }
}