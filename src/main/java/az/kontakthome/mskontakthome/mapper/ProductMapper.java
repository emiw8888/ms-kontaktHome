package az.kontakthome.mskontakthome.mapper;

import az.kontakthome.mskontakthome.dao.entity.ProductEntity;
import az.kontakthome.mskontakthome.model.dto.ProductDto;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class ProductMapper {
    public static final ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "modelName", source = "modelEntity.name")
    public abstract ProductDto mapEntityToDto(ProductEntity productEntity);

    public abstract List<ProductDto> mapEntitiesToDtos(List<ProductEntity> productEntities);
}
