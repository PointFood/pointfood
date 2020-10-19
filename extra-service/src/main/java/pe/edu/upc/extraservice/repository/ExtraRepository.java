package pe.edu.upc.extraservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.extraservice.entity.Extra;

@Repository
public interface ExtraRepository extends JpaRepository<Extra,Long> {
}
