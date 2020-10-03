package pe.edu.upc.clientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upc.clientservice.entity.Client;
import pe.edu.upc.clientservice.service.ClientService;

import java.util.List;
import java.util.Optional;

public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Client>> fetchAll() {
        try {
            List<Client> clients = clientService.findAll();
            return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> fetchById(@PathVariable("id") Long id) {
        try {
            Optional<Client> optionalClient = clientService.findById(id);
            if(optionalClient.isPresent()) {
                return new ResponseEntity<Client>(optionalClient.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch( Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
