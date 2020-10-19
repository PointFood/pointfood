package pe.edu.upc.orderservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.orderservice.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
