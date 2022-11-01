package az.kontakthome.mskontakthome.mapper;

import az.kontakthome.mskontakthome.dao.entity.ModelEntity;
import az.kontakthome.mskontakthome.model.dto.ModelDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class ModelMapper {
    public static final ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    @Mapping(source = "subMenuId", target = "subMenuDto")
    public abstract ModelDto mapModelEntityToModelDto(ModelEntity modelEntity);

    public abstract List<ModelDto> mapModelEntitiesToModelDtos(List<ModelEntity> modelEntities);
}
