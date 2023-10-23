package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.DataBaseRepository;

import java.util.List;

@RestController
public class ProductController {
    DataBaseRepository dataBaseRepository;

    public ProductController(DataBaseRepository dataBaseRepository) {
        this.dataBaseRepository = dataBaseRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam("name") String name) {
        //  System.out.println(dataBaseRepository.getProductName(name));
        return dataBaseRepository.getProductName(name);
    }
}
