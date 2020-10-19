package pe.edu.upc.orderservice.Model;

import lombok.Data;

@Data
public class Restaurant {
    private Long id;
    private String name;
    private String address;
    private String phone;
    private Owner owner;
}
