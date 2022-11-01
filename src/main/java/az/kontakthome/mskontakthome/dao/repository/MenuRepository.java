package az.kontakthome.mskontakthome.dao.repository;

import az.kontakthome.mskontakthome.dao.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Long> {
}
