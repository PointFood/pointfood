package pe.edu.upc.dishservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.dishservice.entity.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {
}
