package pe.edu.upc.restaurantservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.restaurantservice.Entity.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
