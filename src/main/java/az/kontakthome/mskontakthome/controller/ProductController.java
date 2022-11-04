package az.kontakthome.mskontakthome.controller;

import az.kontakthome.mskontakthome.model.dto.ProductDto;
import az.kontakthome.mskontakthome.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> getProducts(){
        return productService.getProducts();
    }
}
