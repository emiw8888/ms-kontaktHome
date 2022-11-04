package az.kontakthome.mskontakthome.service;

import az.kontakthome.mskontakthome.dao.entity.ProductEntity;
import az.kontakthome.mskontakthome.dao.repository.ProductRepository;
import az.kontakthome.mskontakthome.mapper.ProductMapper;
import az.kontakthome.mskontakthome.model.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDto> getProducts(){
        log.info("ActionLog.getProducts.start");
        List<ProductEntity> productEntities = productRepository.findAll();
        log.info("ActionLog.getProducts.end");
        return ProductMapper.INSTANCE.mapEntitiesToDtos(productEntities);
    }

}
