package az.kontakthome.mskontakthome.controller;

import az.kontakthome.mskontakthome.model.dto.ModelDto;
import az.kontakthome.mskontakthome.service.ModelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/v1/models")
public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public List<ModelDto> getModels() {
        return modelService.getModels();
    }
}
