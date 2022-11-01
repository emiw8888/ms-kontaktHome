package az.kontakthome.mskontakthome.service;

import az.kontakthome.mskontakthome.dao.entity.ModelEntity;
import az.kontakthome.mskontakthome.dao.repository.ModelRepository;
import az.kontakthome.mskontakthome.mapper.ModelMapper;
import az.kontakthome.mskontakthome.model.dto.ModelDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ModelService {
    private final ModelRepository modelRepository;

    public List<ModelDto> getModels() {
        log.info("ActionLog.getModels.start");
        List<ModelEntity> modelEntities = modelRepository.findAll();
        List<ModelDto> modelDtos = ModelMapper.INSTANCE.mapModelEntitiesToModelDtos(modelEntities);
        log.info("ActionLog.getModels.end");
        return modelDtos;
    }
}
