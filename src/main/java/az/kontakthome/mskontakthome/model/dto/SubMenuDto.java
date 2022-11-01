package az.kontakthome.mskontakthome.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubMenuDto {
    private Long id;
    private String productType;
    private MenuDto menuDto;
}
