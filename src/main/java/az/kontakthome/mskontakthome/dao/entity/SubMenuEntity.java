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
@Table(name = "sub_menus")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubMenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productType;
    @ManyToOne
    @JoinColumn(name = "menu_id", referencedColumnName = "id")
    private MenuEntity menuId;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
