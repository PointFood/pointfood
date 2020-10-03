package pe.edu.upc.clientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.clientservice.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
