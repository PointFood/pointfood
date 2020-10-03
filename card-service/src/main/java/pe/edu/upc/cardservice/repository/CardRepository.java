package pe.edu.upc.cardservice.repository;

import pe.edu.upc.cardservice.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface
CardRepository extends JpaRepository<Card, Long> {

}