package az.kontakthome.mskontakthome.dao.repository;

import az.kontakthome.mskontakthome.dao.entity.SubMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubMenuRepository extends JpaRepository<SubMenuEntity, Long> {
}
