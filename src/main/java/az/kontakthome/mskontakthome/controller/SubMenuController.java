package az.kontakthome.mskontakthome.controller;

import az.kontakthome.mskontakthome.model.dto.SubMenuDto;
import az.kontakthome.mskontakthome.service.SubMenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/sub-menus")
public class SubMenuController {
    private final SubMenuService subMenuService;

    public SubMenuController(SubMenuService subMenuService) {
        this.subMenuService = subMenuService;
    }

    @GetMapping
    public List<SubMenuDto> getSubMenus() {
        return subMenuService.getSubMenus();
    }
}
