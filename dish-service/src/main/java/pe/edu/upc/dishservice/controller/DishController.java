package pe.edu.upc.dishservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.dishservice.entity.Dish;
import pe.edu.upc.dishservice.service.DishService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/dishes")
public class DishController {
    @Autowired
    private DishService dishService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Dish>> fetchAll() {
        try {
            List<Dish> dishes = dishService.findAll();
            return new ResponseEntity<List<Dish>>(dishes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dish> fetchById(@PathVariable("id") Long id) {
        try {
            Optional<Dish> optionalDish = dishService.findById(id);
            if (optionalDish.isPresent()) {
                return new ResponseEntity<Dish>(optionalDish.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
