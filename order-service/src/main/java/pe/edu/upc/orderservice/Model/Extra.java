package pe.edu.upc.orderservice.Model;

import lombok.Data;

@Data
public class Extra {
    private Long id;
    private String name;
    private String description;
    private double price;
}
