package az.kontakthome.mskontakthome.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ModelDto {
    private Long id;
    private String name;
    private SubMenuDto subMenuDto;
}
