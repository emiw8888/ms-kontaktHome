package az.kontakthome.mskontakthome.controller;

import az.kontakthome.mskontakthome.model.dto.MenuDto;
import az.kontakthome.mskontakthome.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/menus")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<MenuDto> getMenus() {
        return menuService.getMenus();
    }
}
