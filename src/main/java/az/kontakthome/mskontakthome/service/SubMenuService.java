package az.kontakthome.mskontakthome.service;

import az.kontakthome.mskontakthome.dao.entity.SubMenuEntity;
import az.kontakthome.mskontakthome.dao.repository.SubMenuRepository;
import az.kontakthome.mskontakthome.mapper.SubMenuMapper;
import az.kontakthome.mskontakthome.model.dto.SubMenuDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class SubMenuService {
    private final SubMenuRepository subMenuRepository;

    public List<SubMenuDto> getSubMenus() {
        log.info("ActionLog.getSubMenus.start");
        List<SubMenuEntity> subMenuEntities = subMenuRepository.findAll();
        List<SubMenuDto> subMenuDtos = SubMenuMapper.INSTANCE.mapSubMenuEntitiesToSubMenuDtos(subMenuEntities);
        log.info("ActionLog.getSubMenus.end");
        return subMenuDtos;
    }
}
