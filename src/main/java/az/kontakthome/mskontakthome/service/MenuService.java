package az.kontakthome.mskontakthome.service;

import az.kontakthome.mskontakthome.dao.entity.MenuEntity;
import az.kontakthome.mskontakthome.dao.repository.MenuRepository;
import az.kontakthome.mskontakthome.mapper.MenuMapper;
import az.kontakthome.mskontakthome.model.dto.MenuDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class MenuService {
    private final MenuRepository menuRepository;

    public List<MenuDto> getMenus() {
        log.info("ActionLog.getMenus.start");
        List<MenuEntity> menuEntities = menuRepository.findAll();
        List<MenuDto> menuDtos = MenuMapper.INSTANCE.mapMenuEntitiesToMenuDtos(menuEntities);
        log.info("ActionLog.getMenus.end");
        return menuDtos;
    }
}
