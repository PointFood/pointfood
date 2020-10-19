package pe.edu.upc.extraservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.extraservice.entity.Extra;
import pe.edu.upc.extraservice.service.ExtraService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/extras")
public class ExtraController {
    @Autowired
    private ExtraService extraService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Extra>> fetchAll() {
        try {
            List<Extra> extras = extraService.findAll();
            return new ResponseEntity<List<Extra>>(extras, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Extra> fetchById(@PathVariable("id") Long id) {
        try {
            Optional<Extra> optionalExtra = extraService.findById(id);
            if (optionalExtra.isPresent()) {
                return new ResponseEntity<Extra>(optionalExtra.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
