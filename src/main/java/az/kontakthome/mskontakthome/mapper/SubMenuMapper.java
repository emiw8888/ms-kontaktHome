package az.kontakthome.mskontakthome.mapper;

import az.kontakthome.mskontakthome.dao.entity.SubMenuEntity;
import az.kontakthome.mskontakthome.model.dto.SubMenuDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class SubMenuMapper {
    public static final SubMenuMapper INSTANCE = Mappers.getMapper(SubMenuMapper.class);

    @Mapping(source = "menuId", target = "menuDto")
    public abstract SubMenuDto mapSubMenuEntityToSubMenuDto(SubMenuEntity subMenuEntity);

    public abstract List<SubMenuDto> mapSubMenuEntitiesToSubMenuDtos(List<SubMenuEntity> subMenuEntities);
}
