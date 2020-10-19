package pe.edu.upc.orderservice.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import pe.edu.upc.orderservice.Model.Client;
import pe.edu.upc.orderservice.Model.Restaurant;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"registered_at"}, allowGetters = true)
@Builder
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id")
    private Long clientId;

    @Transient
    private Client client;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "registered_at", nullable = false)
    private Date registeredAt;

    @Column(name = "restaurant_id")
    private Long restaurantId;
    @Transient
    private Restaurant restaurant;

    @Column(name="delivery", nullable = false)
    private boolean delivery;

    @Column(name="address", length = 50)
    private String address;

    @Column(name = "total", precision = 6, scale =  2, nullable = false)
    private double total;
}
