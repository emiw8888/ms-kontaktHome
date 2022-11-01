package az.kontakthome.mskontakthome.mapper;

import az.kontakthome.mskontakthome.dao.entity.MenuEntity;
import az.kontakthome.mskontakthome.model.dto.MenuDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class MenuMapper {
    public static final MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    public abstract List<MenuDto> mapMenuEntitiesToMenuDtos(List<MenuEntity> menuEntities);

    public abstract MenuDto mapMenuEntityToMenuDto(MenuEntity menuEntity);
}
