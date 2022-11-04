package az.kontakthome.mskontakthome.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDto {
    private String name;

    private String  modelName;

    private String productCode;

    private Integer productCount;

    private Integer salesCount;

    private Integer productCost;

    private String operatingSystem;

    private String operatingSystemVersion;

    private String screenSize;

    private String backCamera;

    private String frontCamera;

    private Integer cpuCount;

    private Integer simCardCount;

    private String simCardType;

    private String processorName;

    private String processorSpeed;

    private String processorType;

    private String storage;

    private String ram;

    private String network;

    private String displayType;

    private String securityLevel;

    private String productSize;

    private Long screenColorsCount;

    private String videoFormat;

    private Double bluetoothVersion;
}
