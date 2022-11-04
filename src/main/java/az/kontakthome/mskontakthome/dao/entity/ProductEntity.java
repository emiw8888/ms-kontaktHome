package az.kontakthome.mskontakthome.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "model_id", referencedColumnName = "id")
    private ModelEntity modelEntity;

    private String productCode;

    private Integer productCount;

    private Integer salesCount;

    private Integer productCost;

    @Builder.Default
    private Boolean isActive = true;

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

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
